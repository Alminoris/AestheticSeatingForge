package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, AestheticSeating.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        generatedItem(ModItems.CUSHION_REMOVER);
        generatedItem(ModItems.WRENCH);
    }

    private ItemModelBuilder generatedItem(RegistryObject<Item> item)
    {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AestheticSeating.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item)
    {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AestheticSeating.MOD_ID,"item/" + item.getId().getPath()));
    }
}