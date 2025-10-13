package net.alminoris.aestheticseating.item;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AestheticSeating.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItemGroups
{
    public static CreativeModeTab ASEAT_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
    {
        ASEAT_TAB = event.registerCreativeModeTab(ResourceLocation.fromNamespaceAndPath(AestheticSeating.MOD_ID, "aseattab"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.SIMPLE_CHAIRS.get("oak").get().asItem()))
                        .title(Component.translatable("itemgroup.aseattab")));
    }
}