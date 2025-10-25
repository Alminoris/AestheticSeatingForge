package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ModLanguageProviderEnUs extends LanguageProvider
{
    public ModLanguageProviderEnUs(PackOutput output)
    {
        super(output, AestheticSeating.MOD_ID, "en_us");
    }

    @Override
    public void addTranslations()
    {
        for (Block block : ForgeRegistries.BLOCKS)
        {
            ResourceLocation id = ForgeRegistries.BLOCKS.getKey(block);
            String path = id.getPath();

            String pathNew = path;

            pathNew = movePrefix(movePrefix(movePrefix(path, BlockSetsHelper.COLORS), BlockSetsHelper.getStones()), BlockSetsHelper.getWoods());

            String[] parts = pathNew.split("_");

            String displayName = Arrays.stream(parts)
                    .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                    .collect(Collectors.joining(" "));

            displayName = displayName.replace(" Nss", "");

            add("block." + AestheticSeating.MOD_ID + "." + path, displayName);
        }

        add("item." + AestheticSeating.MOD_ID + ".cushion_remover","Cushion Remover");
        add("item." + AestheticSeating.MOD_ID + ".wrench","Wrench");

        add("itemgroup.aedgstab","Aesthetic Edges");
    }

    public static String movePrefix(String input, String[] arr)
    {
        String[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted, (a, b) -> Integer.compare(b.length(), a.length()));

        for (String el : sorted)
        {
            String suffix = "_" + el;
            if (input.endsWith(suffix))
            {
                String base = input.substring(0, input.length() - suffix.length());

                return base.isEmpty() ? el : el + "_" + base;
            }
        }
        return input;
    }
}