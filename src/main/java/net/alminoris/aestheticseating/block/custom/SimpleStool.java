package net.alminoris.aestheticseating.block.custom;

import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.VoxelShapeHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.core.Direction;

import java.util.ArrayList;
import java.util.List;

public class SimpleStool extends SeatingFurniture
{

    private static final VoxelShape SEAT = Block.box(3.2, 0, 3, 12.8, 8, 13);

    public enum CarpetColor implements StringRepresentable {
        BLACK("black"),
        BROWN("brown"),
        GRAY("gray"),
        LIGHT_GRAY("light_gray"),
        WHITE("white"),
        RED("red"),
        ORANGE("orange"),
        YELLOW("yellow"),
        PURPLE("purple"),
        MAGENTA("magenta"),
        PINK("pink"),
        BLUE("blue"),
        CYAN("cyan"),
        LIGHT_BLUE("light_blue"),
        GREEN("green"),
        LIME("lime");

        private final String name;

        CarpetColor(String name) {
            this.name = name;
        }

        public static CarpetColor fromString(String name) {
            for (CarpetColor inside : values()) {
                if (inside.name.equalsIgnoreCase(name)) return inside;
            }
            throw new IllegalArgumentException("No enum constant for name: " + name);
        }

        @Override
        public String getSerializedName() {
            return this.name;
        }
    }

    public enum Form implements StringRepresentable {
        NORMAL("normal"),
        LATTICEBACK("latticeback"),
        DESK("desk");

        private final String name;

        Form(String name) {
            this.name = name;
        }

        public static Form fromString(String name) {
            for (Form inside : values()) {
                if (inside.name.equalsIgnoreCase(name)) return inside;
            }
            throw new IllegalArgumentException("No enum constant for name: " + name);
        }

        @Override
        public String getSerializedName() {
            return this.name;
        }
    }

    public static final EnumProperty<Form> FORM = EnumProperty.create("form", Form.class);
    public static final EnumProperty<CarpetColor> CARPET_COLOR = EnumProperty.create("carpet_color", CarpetColor.class);
    public static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.Plane.HORIZONTAL);
    public static final BooleanProperty CARPETED = BooleanProperty.create("carpeted");

    private final String name;

    public SimpleStool(String name) {
        super(Properties.ofFullCopy(Blocks.OAK_PLANKS), -0.35D);
        this.name = name;
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(FORM, Form.NORMAL)
                .setValue(CARPETED, false)
                .setValue(CARPET_COLOR, CarpetColor.BLACK));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, FORM, CARPETED, CARPET_COLOR);
    }

    @Override
    public ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos,
                                           Player player, InteractionHand hand, BlockHitResult hit)
    {
        Form currentForm = state.getValue(FORM);
        boolean currentCarpeted = state.getValue(CARPETED);

        // Add carpet
        if (stack.is(ItemTags.WOOL_CARPETS) && !currentCarpeted) {
            if (!level.isClientSide) {
                Direction facing = state.getValue(FACING);
                String colorName = stack.getItem().getDescriptionId()
                        .replace("block.minecraft.", "")
                        .replace("_carpet", "");
                level.setBlock(pos, state
                        .setValue(FACING, facing)
                        .setValue(FORM, currentForm)
                        .setValue(CARPETED, true)
                        .setValue(CARPET_COLOR, CarpetColor.fromString(colorName)), 3);

                stack.shrink(1);
            }
            return ItemInteractionResult.SUCCESS;
        }

        // Axe resets form to NORMAL
        if (stack.is(ItemTags.AXES)) {
            if (!level.isClientSide) {
                if (currentForm == Form.DESK || currentForm == Form.LATTICEBACK) {
                    currentForm = Form.NORMAL;
                    stack.hurtAndBreak(1, player, EquipmentSlot.MAINHAND);

                    Direction facing = state.getValue(FACING);
                    CarpetColor carpetColor = state.getValue(CARPET_COLOR);
                    level.setBlock(pos, state
                            .setValue(FACING, facing)
                            .setValue(FORM, currentForm)
                            .setValue(CARPETED, currentCarpeted)
                            .setValue(CARPET_COLOR, carpetColor), 3);
                }
            }
            return ItemInteractionResult.SUCCESS;
        }

        // Wrench transformation based on held block in offhand
        if (stack.is(ModItems.WRENCH.get()) && !player.getOffhandItem().isEmpty()) {
            if (!level.isClientSide) {
                Item offhandItem = player.getOffhandItem().getItem();
                Block block = Block.byItem(offhandItem);
                if (block != Blocks.AIR) {
                    ResourceLocation id = net.minecraft.core.registries.BuiltInRegistries.BLOCK.getKey(block);
                    String path = id.getPath();
                    String result = checkForWrenching(path);

                    if (!result.isEmpty()) {
                        String[] split = result.split("/");
                        if (split.length == 2 && this.name.equals(split[0])) {
                            currentForm = Form.fromString(split[1]);
                            player.getOffhandItem().shrink(1);
                            stack.hurtAndBreak(1, player, EquipmentSlot.MAINHAND);

                            Direction facing = state.getValue(FACING);
                            CarpetColor carpetColor = state.getValue(CARPET_COLOR);
                            level.setBlock(pos, state
                                    .setValue(FACING, facing)
                                    .setValue(FORM, currentForm)
                                    .setValue(CARPETED, currentCarpeted)
                                    .setValue(CARPET_COLOR, carpetColor), 3);
                        }
                    }
                }
            }
            return ItemInteractionResult.SUCCESS;
        }

        // Cushion remover
        if (stack.is(ModItems.CUSHION_REMOVER.get())) {
            if (!level.isClientSide) {
                Direction facing = state.getValue(FACING);
                CarpetColor carpetColor = state.getValue(CARPET_COLOR);
                String colorName = carpetColor.getSerializedName();
                level.setBlock(pos, state
                        .setValue(FACING, facing)
                        .setValue(FORM, currentForm)
                        .setValue(CARPETED, false)
                        .setValue(CARPET_COLOR, carpetColor), 3);

                stack.hurtAndBreak(1, player, EquipmentSlot.MAINHAND);

                Item carpetItem = net.minecraft.core.registries.BuiltInRegistries.ITEM
                        .get(ResourceLocation.fromNamespaceAndPath("minecraft", colorName + "_carpet"));
                ItemStack carpetStack = new ItemStack(carpetItem);
                if (!player.getInventory().add(carpetStack)) {
                    player.drop(carpetStack, false);
                }
            }
            return ItemInteractionResult.SUCCESS;
        }

        return super.useItemOn(stack, state, level, pos, player, hand, hit);
    }

    private String checkForWrenching(String name) {
        name = name.replace("_nss", "");
        String[] nameArr = name.split("_");
        String formRes;

        if (nameArr[0].equals("stripped")) {
            formRes = "/desk";
            if (nameArr.length > 3)
                return nameArr[1] + "_" + nameArr[2] + formRes;
            else
                return nameArr[1] + formRes;
        } else {
            formRes = "/latticeback";
            if (nameArr.length > 2) {
                if (nameArr[2].equals("log") || nameArr[2].equals("stem"))
                    return nameArr[0] + "_" + nameArr[1] + formRes;
            } else {
                if (nameArr[1].equals("log") || nameArr[1].equals("stem")
                        || (nameArr[0].equals("bamboo") && nameArr[1].equals("block")))
                    return nameArr[0] + formRes;
            }
        }
        return "";
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext ctx) {
        return getRotatedShape(state);
    }

    private VoxelShape getRotatedShape(BlockState state) {
        Direction direction = state.getValue(FACING);
        List<AABB> boxes = new ArrayList<>();
        boxes.add(SEAT.bounds());
        return VoxelShapeHelper.rotateShape(boxes, direction);
    }
}
