package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.item.ModItemGroups;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.alminoris.aestheticseating.util.helper.ModJsonHelper;
import net.alminoris.aestheticseating.util.helper.ModJsonTemplates;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import java.util.Enumeration;

public class ModBlockStateProvider extends BlockStateProvider
{
    public ModBlockStateProvider(DataGenerator dataGenerator, ExistingFileHelper exFileHelper)
    {
        super(dataGenerator, AestheticSeating.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        for(String woodName : BlockSetsHelper.WOODS)
        {
            for(String name : BlockSetsHelper.COLORS)
            {
                registerSimpleChair(woodName, name, "minecraft");
                registerSimpleStool(woodName, name, "minecraft");
            }
            registerSimpleBench(woodName, "minecraft");
            registerSeatingLog(woodName, "minecraft");
            ModJsonHelper.createSimpleChairBlockState(woodName);
            ModJsonHelper.createSimpleBenchBlockState(woodName);
            ModJsonHelper.createSimpleStoolBlockState(woodName);
            ModJsonHelper.createSeatingLogBlockState(woodName);
            blockItem(ModBlocks.SIMPLE_CHAIRS.get(woodName), "block/black/simple_chair_"+woodName);
            blockItem(ModBlocks.SIMPLE_BENCHES.get(woodName), "block/simple_bench_"+woodName);
            blockItem(ModBlocks.SIMPLE_STOOLS.get(woodName), "block/black/simple_stool_normal_"+woodName);
            blockItem(ModBlocks.SEATING_LOGS.get(woodName), "block/seating_log_"+woodName);
        }

        for(String woodName : ModItemGroups.AN_WOOD_NAMES)
        {
            for(String name : BlockSetsHelper.COLORS)
            {
                registerSimpleChair(woodName, name, "aestheticseating");
                registerSimpleStool(woodName, name, "aestheticseating");
            }
            registerSimpleBench(woodName, "aestheticseating");
            registerSeatingLog(woodName, "aestheticseating");
            ModJsonHelper.createSimpleChairBlockState(woodName);
            ModJsonHelper.createSimpleBenchBlockState(woodName);
            ModJsonHelper.createSimpleStoolBlockState(woodName);
            ModJsonHelper.createSeatingLogBlockState(woodName);
            blockItem(ModBlocks.SIMPLE_CHAIRS.get(woodName), "block/black/simple_chair_"+woodName);
            blockItem(ModBlocks.SIMPLE_BENCHES.get(woodName), "block/simple_bench_"+woodName);
            blockItem(ModBlocks.SIMPLE_STOOLS.get(woodName), "block/black/simple_stool_normal_"+woodName);
            blockItem(ModBlocks.SEATING_LOGS.get(woodName), "block/seating_log_"+woodName);
        }

        for(String woodName : ModItemGroups.WF_WOOD_NAMES)
        {
            for(String name : BlockSetsHelper.COLORS)
            {
                registerSimpleChair(woodName, name, "aestheticseating");
                registerSimpleStool(woodName, name, "aestheticseating");
            }
            registerSimpleBench(woodName, "aestheticseating");
            registerSeatingLog(woodName, "aestheticseating");
            ModJsonHelper.createSimpleChairBlockState(woodName);
            ModJsonHelper.createSimpleBenchBlockState(woodName);
            ModJsonHelper.createSimpleStoolBlockState(woodName);
            ModJsonHelper.createSeatingLogBlockState(woodName);
            blockItem(ModBlocks.SIMPLE_CHAIRS.get(woodName), "block/black/simple_chair_"+woodName);
            blockItem(ModBlocks.SIMPLE_BENCHES.get(woodName), "block/simple_bench_"+woodName);
            blockItem(ModBlocks.SIMPLE_STOOLS.get(woodName), "block/black/simple_stool_normal_"+woodName);
            blockItem(ModBlocks.SEATING_LOGS.get(woodName), "block/seating_log_"+woodName);
        }

        for(String woodName : ModItemGroups.ST_WOOD_NAMES)
        {
            for(String name : BlockSetsHelper.COLORS)
            {
                registerSimpleChair(woodName, name, "aestheticseating");
                registerSimpleStool(woodName, name, "aestheticseating");
            }
            registerSimpleBench(woodName, "aestheticseating");
            registerSeatingLog(woodName, "aestheticseating");
            ModJsonHelper.createSimpleChairBlockState(woodName);
            ModJsonHelper.createSimpleBenchBlockState(woodName);
            ModJsonHelper.createSimpleStoolBlockState(woodName);
            ModJsonHelper.createSeatingLogBlockState(woodName);
            blockItem(ModBlocks.SIMPLE_CHAIRS.get(woodName), "block/black/simple_chair_"+woodName);
            blockItem(ModBlocks.SIMPLE_BENCHES.get(woodName), "block/simple_bench_"+woodName);
            blockItem(ModBlocks.SIMPLE_STOOLS.get(woodName), "block/black/simple_stool_normal_"+woodName);
            blockItem(ModBlocks.SEATING_LOGS.get(woodName), "block/seating_log_"+woodName);
        }

        for(String woodName : ModItemGroups.WT_WOOD_NAMES)
        {
            for(String name : BlockSetsHelper.COLORS)
            {
                registerSimpleChair(woodName, name, "aestheticseating");
                registerSimpleStool(woodName, name, "aestheticseating");
            }
            registerSimpleBench(woodName, "aestheticseating");
            registerSeatingLog(woodName, "aestheticseating");
            ModJsonHelper.createSimpleChairBlockState(woodName);
            ModJsonHelper.createSimpleBenchBlockState(woodName);
            ModJsonHelper.createSimpleStoolBlockState(woodName);
            ModJsonHelper.createSeatingLogBlockState(woodName);
            blockItem(ModBlocks.SIMPLE_CHAIRS.get(woodName), "block/black/simple_chair_"+woodName);
            blockItem(ModBlocks.SIMPLE_BENCHES.get(woodName), "block/simple_bench_"+woodName);
            blockItem(ModBlocks.SIMPLE_STOOLS.get(woodName), "block/black/simple_stool_normal_"+woodName);
            blockItem(ModBlocks.SEATING_LOGS.get(woodName), "block/seating_log_"+woodName);
        }

        for(String woodName : ModItemGroups.MT_WOOD_NAMES)
        {
            for(String name : BlockSetsHelper.COLORS)
            {
                registerSimpleChair(woodName, name, "aestheticseating");
                registerSimpleStool(woodName, name, "aestheticseating");
            }
            registerSimpleBench(woodName, "aestheticseating");
            registerSeatingLog(woodName, "aestheticseating");
            ModJsonHelper.createSimpleChairBlockState(woodName);
            ModJsonHelper.createSimpleBenchBlockState(woodName);
            ModJsonHelper.createSimpleStoolBlockState(woodName);
            ModJsonHelper.createSeatingLogBlockState(woodName);
            blockItem(ModBlocks.SIMPLE_CHAIRS.get(woodName), "block/black/simple_chair_"+woodName);
            blockItem(ModBlocks.SIMPLE_BENCHES.get(woodName), "block/simple_bench_"+woodName);
            blockItem(ModBlocks.SIMPLE_STOOLS.get(woodName), "block/black/simple_stool_normal_"+woodName);
            blockItem(ModBlocks.SEATING_LOGS.get(woodName), "block/seating_log_"+woodName);
        }

        for(String woodName : ModItemGroups.NSS_WOOD_NAMES)
        {
            for(String name : BlockSetsHelper.COLORS)
            {
                registerSimpleChair(woodName, name, "aestheticseating");
                registerSimpleStool(woodName, name, "aestheticseating");
            }
            registerSimpleBench(woodName, "aestheticseating");
            registerSeatingLog(woodName, "aestheticseating");
            ModJsonHelper.createSimpleChairBlockState(woodName);
            ModJsonHelper.createSimpleBenchBlockState(woodName);
            ModJsonHelper.createSimpleStoolBlockState(woodName);
            ModJsonHelper.createSeatingLogBlockState(woodName);
            blockItem(ModBlocks.SIMPLE_CHAIRS.get(woodName), "block/black/simple_chair_"+woodName);
            blockItem(ModBlocks.SIMPLE_BENCHES.get(woodName), "block/simple_bench_"+woodName);
            blockItem(ModBlocks.SIMPLE_STOOLS.get(woodName), "block/black/simple_stool_normal_"+woodName);
            blockItem(ModBlocks.SEATING_LOGS.get(woodName), "block/seating_log_"+woodName);
        }

        for(String name : BlockSetsHelper.STONES)
        {
            registerStoneBench(name, "minecraft");
            ModJsonHelper.createStoneBenchBlockState(name);
            blockItem(ModBlocks.STONE_BENCHES.get(name), "block/stone_bench_"+name);
        }

        for(String name : ModItemGroups.EXTRA_STONES_WF)
        {
            registerStoneBench(name, "aestheticseating");
            ModJsonHelper.createStoneBenchBlockState(name);
            blockItem(ModBlocks.STONE_BENCHES.get(name), "block/stone_bench_"+name);
        }

        for(String name : BlockSetsHelper.COLORS)
        {
            registerSofa(name, "minecraft");
            ModJsonHelper.createSofaBlockState(name);
            blockItem(ModBlocks.SOFAS.get(name), "block/sofa_"+name);

            registerSettee(name, "minecraft");
            blockItem(ModBlocks.SETTEES.get(name), "block/settee_"+name+"_0");

            ModJsonHelper.createCushionModel(name, "minecraft");
            ModJsonHelper.createSimpleBlockState("cushion_"+name);
            blockItem(ModBlocks.CUSHIONS.get(name), "block/cushion_"+name);
        }
    }

    private void registerSimpleChair(String woodVariant, String colorVariant, String modId)
    {
        ModJsonHelper.createSimpleChairModel(ModJsonTemplates.SIMPLE_CHAIR_TEMPLATE, colorVariant, woodVariant, modId,false, false);
        ModJsonHelper.createSimpleChairModel(ModJsonTemplates.SIMPLE_CHAIR_RECLINED_TEMPLATE, colorVariant, woodVariant, modId,true, false);
        ModJsonHelper.createSimpleChairModel(ModJsonTemplates.SIMPLE_CHAIR_CARPETED_TEMPLATE, colorVariant, woodVariant, modId,false, true);
        ModJsonHelper.createSimpleChairModel(ModJsonTemplates.SIMPLE_CHAIR_RECLINED_CARPETED_TEMPLATE, colorVariant, woodVariant, modId,true, true);
    }

    private void registerSimpleBench(String woodVariant, String modId)
    {
        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_NORMAL_MODEL, woodVariant, modId,"normal", false);
        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_CENTER_MODEL, woodVariant, modId,"center", false);
        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_LEFT_MODEL, woodVariant, modId,"left", false);
        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_RIGHT_MODEL, woodVariant, modId,"right", false);

        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_NORMAL_BACKREST_MODEL, woodVariant, modId,"normal", true);
        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_CENTER_BACKREST_MODEL, woodVariant, modId,"center", true);
        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_LEFT_BACKREST_MODEL, woodVariant, modId,"left", true);
        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_RIGHT_BACKREST_MODEL, woodVariant, modId,"right", true);
    }

    private void registerStoneBench(String stoneVariant, String modId)
    {
        ModJsonHelper.createStoneBenchModel(ModJsonTemplates.STONE_BENCH_NORMAL_MODEL, stoneVariant, modId,"normal");
        ModJsonHelper.createStoneBenchModel(ModJsonTemplates.STONE_BENCH_CENTER_MODEL, stoneVariant, modId,"center");
        ModJsonHelper.createStoneBenchModel(ModJsonTemplates.STONE_BENCH_LEFT_MODEL, stoneVariant, modId,"left");
        ModJsonHelper.createStoneBenchModel(ModJsonTemplates.STONE_BENCH_RIGHT_MODEL, stoneVariant, modId,"right");
    }

    private void registerSeatingLog(String woodName, String modId)
    {
        ModJsonHelper.createSeatingLogModel(ModJsonTemplates.SEATING_LOG, woodName, modId,"normal");
        ModJsonHelper.createSeatingLogModel(ModJsonTemplates.SEATING_LOG_CENTER, woodName, modId,"center");
        ModJsonHelper.createSeatingLogModel(ModJsonTemplates.SEATING_LOG_LEFT, woodName, modId,"left");
        ModJsonHelper.createSeatingLogModel(ModJsonTemplates.SEATING_LOG_RIGHT, woodName, modId,"right");
    }

    private void registerSofa(String colorVariant, String modId)
    {
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_NORMAL_MODEL, colorVariant, modId,"normal", false);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_CENTER_MODEL, colorVariant, modId,"center", false);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_LEFT_MODEL, colorVariant, modId,"left", false);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_RIGHT_MODEL, colorVariant, modId,"right", false);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_LEFTCORNER_MODEL, colorVariant, modId,"leftcorner", false);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_RIGHTCORNER_MODEL, colorVariant, modId,"rightcorner", false);

        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_NORMAL_CUSHION_MODEL, colorVariant, modId,"normal", true);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_CENTER_CUSHION_MODEL, colorVariant, modId,"center", true);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_LEFT_CUSHION_MODEL, colorVariant, modId,"left", true);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_RIGHT_CUSHION_MODEL, colorVariant, modId,"right", true);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_LEFTCORNER_CUSHION_MODEL, colorVariant, modId,"leftcorner", true);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_RIGHTCORNER_CUSHION_MODEL, colorVariant, modId,"rightcorner", true);
    }

    private void registerSimpleStool(String woodVariant, String colorVariant, String modId)
    {
        ModJsonHelper.createSimpleStoolModel(ModJsonTemplates.SIMPLE_STOOL_NORMAL_MODEL_TEMPLATE, colorVariant, woodVariant, modId,"normal", false);
        ModJsonHelper.createSimpleStoolModel(ModJsonTemplates.SIMPLE_STOOL_LATTICEBACK_MODEL_TEMPLATE, colorVariant, woodVariant, modId,"latticeback", false);
        ModJsonHelper.createSimpleStoolModel(ModJsonTemplates.SIMPLE_STOOL_DESK_MODEL_TEMPLATE, colorVariant, woodVariant, modId,"desk", false);
        ModJsonHelper.createSimpleStoolModel(ModJsonTemplates.SIMPLE_STOOL_NORMAL_CARPETED_MODEL_TEMPLATE, colorVariant, woodVariant, modId,"normal", true);
        ModJsonHelper.createSimpleStoolModel(ModJsonTemplates.SIMPLE_STOOL_LATTICEBACK_CARPETED_MODEL_TEMPLATE, colorVariant, woodVariant, modId,"latticeback", true);
        ModJsonHelper.createSimpleStoolModel(ModJsonTemplates.SIMPLE_STOOL_DESK_CARPETED_MODEL_TEMPLATE, colorVariant, woodVariant, modId,"desk", true);
    }

    private void registerSettee(String colorVariant, String modId)
    {
        ModJsonHelper.createSetteeModel(ModJsonTemplates.SETTEE_0_MODEL_TEMPLATE, colorVariant, modId,false, 0);
        ModJsonHelper.createSetteeModel(ModJsonTemplates.SETTEE_TRANSFORMED_0_MODEL_TEMPLATE, colorVariant, modId,true, 0);
        ModJsonHelper.createSetteeModel(ModJsonTemplates.SETTEE_1_MODEL_TEMPLATE, colorVariant, modId,false, 1);
        ModJsonHelper.createSetteeModel(ModJsonTemplates.SETTEE_TRANSFORMED_1_MODEL_TEMPLATE, colorVariant, modId,true, 1);
        ModJsonHelper.createSetteeModel(ModJsonTemplates.SETTEE_2_MODEL_TEMPLATE, colorVariant, modId,false, 2);
        ModJsonHelper.createSetteeModel(ModJsonTemplates.SETTEE_TRANSFORMED_2_MODEL_TEMPLATE, colorVariant, modId,true, 2);
        ModJsonHelper.createSetteeBlockState(colorVariant);
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String name)
    {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("aestheticseating:" + name));
    }
}