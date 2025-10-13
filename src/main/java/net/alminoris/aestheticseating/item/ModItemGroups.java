package net.alminoris.aestheticseating.item;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.alminoris.aestheticseating.util.helper.BlockSetsHelper.*;
import static net.alminoris.aestheticseating.util.helper.BlockSetsHelper.NSS_WOOD_NAMES;

@Mod.EventBusSubscriber(modid = AestheticSeating.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItemGroups
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AestheticSeating.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ASEAT_TAB = CREATIVE_MODE_TABS.register("aseattab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(ModBlocks.SIMPLE_CHAIRS.get("oak").get().asItem()::getDefaultInstance)
            .title(Component.translatable("itemgroup.aseattab"))
            .displayItems((parameters, entries) ->
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
                if (ModList.get().isLoaded("wildfields"))
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
            }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}