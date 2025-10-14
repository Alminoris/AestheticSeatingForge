package net.alminoris.aestheticseating.datagen.loot;

import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLoot
{
    @Override
    protected void addTables()
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
