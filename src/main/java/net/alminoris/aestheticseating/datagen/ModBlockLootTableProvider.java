package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider
{
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries)
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate()
    {
        for(String name : BlockSetsHelper.getWoods())
        {
            dropSelf(ModBlocks.SIMPLE_CHAIRS.get(name).get());
            dropSelf(ModBlocks.SIMPLE_BENCHES.get(name).get());
            dropSelf(ModBlocks.SIMPLE_STOOLS.get(name).get());
            dropSelf(ModBlocks.SEATING_LOGS.get(name).get());
        }
        for(String name : BlockSetsHelper.getStones())
        {
            dropSelf(ModBlocks.STONE_BENCHES.get(name).get());
        }
        for(String name : BlockSetsHelper.COLORS)
        {
            dropSelf(ModBlocks.SOFAS.get(name).get());
            dropSelf(ModBlocks.SETTEES.get(name).get());
            dropSelf(ModBlocks.CUSHIONS.get(name).get());
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}