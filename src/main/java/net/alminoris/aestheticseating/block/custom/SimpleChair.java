package net.alminoris.aestheticseating.block.custom;

import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.VoxelShapeHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResult;
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
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.AABB;
import net.minecraft.core.Direction;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class SimpleChair extends SeatingFurniture
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

    public static final EnumProperty<CarpetColor> CARPET_COLOR = EnumProperty.create("carpet_color", CarpetColor.class);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty CARPETED = BooleanProperty.create("carpeted");
    public static final BooleanProperty RECLINED = BooleanProperty.create("reclined");

    public SimpleChair() {
        super(Properties.copy(Blocks.OAK_PLANKS), -0.30D);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(RECLINED, false)
                .setValue(CARPETED, false)
                .setValue(CARPET_COLOR, CarpetColor.BLACK));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, RECLINED, CARPETED, CARPET_COLOR);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos,
                                           Player player, InteractionHand hand, BlockHitResult hit)
    {
        ItemStack stack = player.getItemInHand(hand);
        boolean currentReclined = state.getValue(RECLINED);
        boolean currentCarpeted = state.getValue(CARPETED);

        // Add carpet
        if (stack.is(ItemTags.WOOL_CARPETS) && !currentCarpeted)
        {
            if (!level.isClientSide) {
                Direction facing = state.getValue(FACING);
                String colorName = stack.getItem().getDescriptionId().replace("block.minecraft.", "").replace("_carpet", "");
                level.setBlock(pos, state
                        .setValue(FACING, facing)
                        .setValue(RECLINED, currentReclined)
                        .setValue(CARPETED, true)
                        .setValue(CARPET_COLOR, CarpetColor.fromString(colorName)), 3);

                stack.shrink(1);
            }
            return InteractionResult.SUCCESS;
        }

        // Recline using wrench
        if (stack.is(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),
                ResourceLocation.fromNamespaceAndPath("aestheticseating", "wrench"))))
        {
            if (!level.isClientSide) {
                level.setBlock(pos, state.setValue(RECLINED, !currentReclined), 3);
                stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(InteractionHand.MAIN_HAND));
            }
            return InteractionResult.SUCCESS;
        }

        // Remove cushion
        if (stack.is(ModItems.CUSHION_REMOVER.get()))
        {
            if (!level.isClientSide) {
                Direction facing = state.getValue(FACING);
                CarpetColor carpetColor = state.getValue(CARPET_COLOR);
                level.setBlock(pos, state
                        .setValue(FACING, facing)
                        .setValue(RECLINED, currentReclined)
                        .setValue(CARPETED, false)
                        .setValue(CARPET_COLOR, carpetColor), 3);

                stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(InteractionHand.MAIN_HAND));

                Item carpetItem = Registry.ITEM
                        .get(ResourceLocation.fromNamespaceAndPath("minecraft", carpetColor.getSerializedName() + "_carpet"));
                ItemStack carpetStack = new ItemStack(carpetItem);

                if (!player.getInventory().add(carpetStack))
                    player.drop(carpetStack, false);
            }
            return InteractionResult.SUCCESS;
        }

        return super.use(state, level, pos, player, hand, hit);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext ctx)
    {
        return getRotatedShape(state);
    }

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction dir = state.getValue(FACING);
        List<AABB> boxes = new ArrayList<>();
        boxes.add(SEAT.bounds());
        return VoxelShapeHelper.rotateShape(boxes, dir);
    }
}