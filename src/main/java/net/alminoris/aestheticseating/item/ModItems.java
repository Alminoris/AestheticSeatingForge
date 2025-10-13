package net.alminoris.aestheticseating.item;

import net.alminoris.aestheticseating.AestheticSeating;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AestheticSeating.MOD_ID);

    public static final RegistryObject<Item> CUSHION_REMOVER = registerItem("cushion_remover", () -> new TieredItem(Tiers.IRON, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WRENCH = registerItem("wrench", () -> new TieredItem(Tiers.IRON, new Item.Properties().stacksTo(1)));

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item)
    {
        return ITEMS.register(name, item);
    }

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}