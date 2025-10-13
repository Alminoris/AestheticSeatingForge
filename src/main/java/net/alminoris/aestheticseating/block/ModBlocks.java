package net.alminoris.aestheticseating.block;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.block.custom.*;
import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AestheticSeating.MOD_ID);

    public static final Dictionary<String, RegistryObject<Block>> SEATING_LOGS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("seating_log_"+name, () -> new SeatingLog()));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> SIMPLE_CHAIRS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("simple_chair_"+name, () -> new SimpleChair()));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> SIMPLE_BENCHES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("simple_bench_"+name, () -> new SimpleBench(name)));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> STONE_BENCHES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("stone_bench_"+name, () -> new StoneBench()));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> SIMPLE_STOOLS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("simple_stool_"+name, () -> new SimpleStool(name)));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> SETTEES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("settee_"+name, () -> new Settee(name)));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> SOFAS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("sofa_"+name, () -> new Sofa(name)));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> CUSHIONS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("cushion_"+name, () -> new Cushion()));
        }
    }};
    
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block)
    {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}