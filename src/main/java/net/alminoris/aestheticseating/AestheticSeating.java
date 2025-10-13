package net.alminoris.aestheticseating;

import com.mojang.logging.LogUtils;
import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.entity.ModEntities;
import net.alminoris.aestheticseating.item.ModItemGroups;
import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.NoopRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static net.alminoris.aestheticseating.util.helper.BlockSetsHelper.*;
import static net.alminoris.aestheticseating.util.helper.BlockSetsHelper.NSS_WOOD_NAMES;

@Mod(AestheticSeating.MOD_ID)
public class AestheticSeating
{
    public static final String MOD_ID = "aestheticseating";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AestheticSeating(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);

        ModBlocks.register(modEventBus);

        ModEntities.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents entries)
    {
        if (entries.getTab() == ModItemGroups.ASEAT_TAB)
        {
            entries.accept(ModItems.CUSHION_REMOVER.get());
            entries.accept(ModItems.WRENCH.get());
            for(String name : BlockSetsHelper.WOODS)
            {
                entries.accept(ModBlocks.SIMPLE_CHAIRS.get(name).get());
            }
            for(String name : BlockSetsHelper.WOODS)
            {
                entries.accept(ModBlocks.SIMPLE_STOOLS.get(name).get());
            }
            for(String name : BlockSetsHelper.WOODS)
            {
                entries.accept(ModBlocks.SIMPLE_BENCHES.get(name).get());
            }
            for(String name : BlockSetsHelper.STONES)
            {
                entries.accept(ModBlocks.STONE_BENCHES.get(name).get());
            }
            for(String name : BlockSetsHelper.WOODS)
            {
                entries.accept(ModBlocks.SEATING_LOGS.get(name).get());
            }
            if (ModList.get().isLoaded("arborealnature"))
            {
                for(String name : AN_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_CHAIRS.get(name).get());
                }
                for(String name : AN_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_STOOLS.get(name).get());
                }
                for(String name : AN_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_BENCHES.get(name).get());
                }
                for(String name : AN_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SEATING_LOGS.get(name).get());
                }
            }
            if (ModList.get().isLoaded("aestheticseating"))
            {
                for(String name : WF_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_CHAIRS.get(name).get());
                }
                for(String name : WF_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_STOOLS.get(name).get());
                }
                for(String name : WF_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_BENCHES.get(name).get());
                }
                for(String name : EXTRA_STONES_WF)
                {
                    entries.accept(ModBlocks.STONE_BENCHES.get(name).get());
                }
                for(String name : WF_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SEATING_LOGS.get(name).get());
                }
            }
            if (ModList.get().isLoaded("silverwoodtrees"))
            {
                for(String name : ST_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_CHAIRS.get(name).get());
                }
                for(String name : ST_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_STOOLS.get(name).get());
                }
                for(String name : ST_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_BENCHES.get(name).get());
                }
                for(String name : ST_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SEATING_LOGS.get(name).get());
                }
            }
            if (ModList.get().isLoaded("whisperleaftrees"))
            {
                for(String name : WT_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_CHAIRS.get(name).get());
                }
                for(String name : WT_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_STOOLS.get(name).get());
                }
                for(String name : WT_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_BENCHES.get(name).get());
                }
                for(String name : WT_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SEATING_LOGS.get(name).get());
                }
            }
            if (ModList.get().isLoaded("missingtrees"))
            {
                for(String name : MT_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_CHAIRS.get(name).get());
                }
                for(String name : MT_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_STOOLS.get(name).get());
                }
                for(String name : MT_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_BENCHES.get(name).get());
                }
                for(String name : MT_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SEATING_LOGS.get(name).get());
                }
            }
            if (ModList.get().isLoaded("natures_spirit"))
            {
                for(String name : NSS_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_CHAIRS.get(name).get());
                }
                for(String name : NSS_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_STOOLS.get(name).get());
                }
                for(String name : NSS_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SIMPLE_BENCHES.get(name).get());
                }
                for(String name : NSS_WOOD_NAMES)
                {
                    entries.accept(ModBlocks.SEATING_LOGS.get(name).get());
                }
            }
            for(String name : BlockSetsHelper.COLORS)
            {
                entries.accept(ModBlocks.SOFAS.get(name).get());
            }
            for(String name : BlockSetsHelper.COLORS)
            {
                entries.accept(ModBlocks.SETTEES.get(name).get());
            }
            for(String name : BlockSetsHelper.COLORS)
            {
                entries.accept(ModBlocks.CUSHIONS.get(name).get());
            }
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntities.SEAT.get(), NoopRenderer::new);
        }
    }
}