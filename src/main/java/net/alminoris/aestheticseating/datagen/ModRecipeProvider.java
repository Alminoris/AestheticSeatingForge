package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.item.ModItemGroups;
import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.alminoris.aestheticseating.util.helper.ModJsonHelper;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder
{
    public ModRecipeProvider(DataGenerator pOutput)
    {
        super(pOutput);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> recipeOutput)
    {
        ShapedRecipeBuilder.shaped(ModItems.CUSHION_REMOVER.get(), 1)
                .pattern(" ##")
                .pattern(" /#")
                .pattern("/  ")
                .define('#', Items.IRON_INGOT)
                .define('/', Items.STICK)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(ModItems.WRENCH.get(), 1)
                .pattern(" # ")
                .pattern(" ##")
                .pattern("/  ")
                .define('#', Items.IRON_INGOT)
                .define('/', Items.STICK)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(recipeOutput);

        for(String name : BlockSetsHelper.WOODS)
        {
            String blockName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");

            registerSimpleChair(recipeOutput, ModBlocks.SIMPLE_CHAIRS.get(name).get(),
                    ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("minecraft", name+"_slab")),
                    ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("minecraft", name+"_"+blockName)));

            registerSimpleStool(recipeOutput, ModBlocks.SIMPLE_STOOLS.get(name).get(),
                    ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("minecraft", name+"_slab")),
                    ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("minecraft", name+"_"+blockName)));

            registerSimpleBench(recipeOutput, ModBlocks.SIMPLE_BENCHES.get(name).get(),
                    ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("minecraft", name+"_slab")),
                    ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("minecraft", name+"_"+blockName)));

            registerSeatingLog(recipeOutput, ModBlocks.SEATING_LOGS.get(name).get(),
                    ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("minecraft", name+"_"+blockName)));
        }

        for(String name : BlockSetsHelper.COLORS)
        {
            registerSettee(recipeOutput, ModBlocks.SETTEES.get(name).get(),
                    ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("minecraft", name+"_wool")));

            registerSofa(recipeOutput, ModBlocks.SOFAS.get(name).get(),
                    ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("minecraft", name+"_wool")));
        }

        for(String name : BlockSetsHelper.COLORS)
        {
            ShapelessRecipeBuilder.shapeless(ModBlocks.CUSHIONS.get(name).get())
                    .requires(ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("minecraft", name+"_wool")))
                    .unlockedBy(getHasName(ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("minecraft", name+"_wool"))),
                            has(ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("minecraft", name+"_wool"))))
                    .save(recipeOutput);
        }

        for(String name : BlockSetsHelper.STONES)
        {
            registerVanillaStoneBench(name);
        }

        for(String name : ModItemGroups.EXTRA_STONES_WF)
        {
            registerStoneBench(name, "aestheticseating");
        }

        for(String name : ModItemGroups.AN_WOOD_NAMES)
        {
            registerSimpleChair(name, "arborealnature");
            registerSimpleStool(name, "arborealnature");
            registerSimpleBench(name, "arborealnature");
            registerSeatingLog(name, "arborealnature");
        }

        for(String name : ModItemGroups.WF_WOOD_NAMES)
        {
            registerSimpleChair(name, "aestheticseating");
            registerSimpleStool(name, "aestheticseating");
            registerSimpleBench(name, "aestheticseating");
            registerSeatingLog(name, "aestheticseating");
        }

        for(String name : ModItemGroups.ST_WOOD_NAMES)
        {
            registerSimpleChair(name, "silverwoodtrees");
            registerSimpleStool(name, "silverwoodtrees");
            registerSimpleBench(name, "silverwoodtrees");
            registerSeatingLog(name, "silverwoodtrees");
        }

        for(String name : ModItemGroups.WT_WOOD_NAMES)
        {
            registerSimpleChair(name, "whisperleaftrees");
            registerSimpleStool(name, "whisperleaftrees");
            registerSimpleBench(name, "whisperleaftrees");
            registerSeatingLog(name, "whisperleaftrees");
        }

        for(String name : ModItemGroups.MT_WOOD_NAMES)
        {
            registerSimpleChair(name, "missingtrees");
            registerSimpleStool(name, "missingtrees");
            registerSimpleBench(name, "missingtrees");
            registerSeatingLog(name, "missingtrees");
        }

        for(String name : ModItemGroups.NSS_WOOD_NAMES)
        {
            registerSimpleChair(name, "natures_spirit");
            registerSimpleStool(name, "natures_spirit");
            registerSimpleBench(name, "natures_spirit");
            registerSeatingLog(name, "natures_spirit");
        }
    }

    private static void registerSimpleChair(Consumer<FinishedRecipe> recipeOutput, Block block, Block slab, Block log)
    {
        ShapedRecipeBuilder.shaped(block, 1)
                .pattern("#  ")
                .pattern("###")
                .pattern("/ /")
                .define('#', slab)
                .define('/', log)
                .unlockedBy(getHasName(slab), has(slab))
                .unlockedBy(getHasName(log), has(log))
                .save(recipeOutput);
    }

    private static void registerSimpleBench(Consumer<FinishedRecipe> recipeOutput, Block block, Block slab, Block log)
    {
        ShapedRecipeBuilder.shaped(block, 1)
                .pattern("##")
                .pattern("//")
                .define('#', slab)
                .define('/', log)
                .unlockedBy(getHasName(slab), has(slab))
                .unlockedBy(getHasName(log), has(log))
                .save(recipeOutput);
    }

    private static void registerSeatingLog(Consumer<FinishedRecipe> recipeOutput, Block block, Block log)
    {
        ShapedRecipeBuilder.shaped(block, 1)
                .pattern("##")
                .define('#', log)
                .unlockedBy(getHasName(log), has(log))
                .save(recipeOutput);
    }

    private static void registerVanillaStoneBench(String name)
    {
        Block block = ForgeRegistries.BLOCKS.getValue(ResourceLocation.tryParse(name.equals("basalt_side") ? "basalt" :
                (name.equals("quartz_block_bottom") ? "quartz_block" : name)));

        ModJsonHelper.createShapedRecipe("stone_bench_" + name, "1", "minecraft:smooth_stone", ForgeRegistries.BLOCKS.getKey(block).getPath(),
                "\"##\",", "\"//\"", "");
    }

    private static void registerStoneBench(String name, String modId)
    {
        ModJsonHelper.createShapedRecipe("stone_bench_" + name, "1", "minecraft:smooth_stone", modId+":"+name,
                "\"##\",", "\"//\"", "");
    }

    private static void registerSimpleBench(String name, String modId)
    {
        ModJsonHelper.createShapedRecipe("simple_bench_" + name, "1", modId+":"+name+"_slab", modId+":"+name+"_log",
                "\"##\",", "\"//\"", "");
    }

    private static void registerSeatingLog(String name, String modId)
    {
        ModJsonHelper.createShapedRecipe("seating_log_" + name, "1", modId+":"+name+"_log", modId+":"+name+"_log",
                "\"#/\"", "", "");
    }

    private static void registerSimpleChair(String name, String modId)
    {
        ModJsonHelper.createShapedRecipe("simple_chair_" + name, "1", modId+":"+name+"_slab", modId+":"+name+"_log",
                "\"#  \",", "\"###\",", "\"/ /\"");
    }

    private static void registerSimpleStool(String name, String modId)
    {
        ModJsonHelper.createShapedRecipe("simple_chair_" + name, "1", modId+":"+name+"_slab", modId+":"+name+"_log",
                "\"###\",", "\"/ /\"", "");
    }

    private static void registerSimpleStool(Consumer<FinishedRecipe> recipeOutput, Block block, Block slab, Block log)
    {
        ShapedRecipeBuilder.shaped(block, 1)
                .pattern("###")
                .pattern("/ /")
                .define('#', slab)
                .define('/', log)
                .unlockedBy(getHasName(slab), has(slab))
                .unlockedBy(getHasName(log), has(log))
                .save(recipeOutput);
    }

    private static void registerSettee(Consumer<FinishedRecipe> recipeOutput, Block block, Block wool)
    {
        ShapedRecipeBuilder.shaped(block, 1)
                .pattern("# #")
                .pattern("###")
                .define('#', wool)
                .unlockedBy(getHasName(wool), has(wool))
                .save(recipeOutput);
    }

    private static void registerSofa(Consumer<FinishedRecipe> recipeOutput, Block block, Block wool)
    {
        ShapedRecipeBuilder.shaped(block, 1)
                .pattern("##")
                .pattern("//")
                .define('#', wool)
                .define('/', Blocks.GRAY_CONCRETE)
                .unlockedBy(getHasName(wool), has(wool))
                .unlockedBy(getHasName(Blocks.GRAY_CONCRETE), has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput);
    }
}