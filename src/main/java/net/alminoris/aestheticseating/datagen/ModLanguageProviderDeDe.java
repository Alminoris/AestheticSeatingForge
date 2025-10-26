package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.AestheticSeating;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderDeDe extends LanguageProvider
{
    public ModLanguageProviderDeDe(DataGenerator output)
    {
        super(output, AestheticSeating.MOD_ID, "de_de");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> colorFurniture = new LinkedHashMap<>();
        colorFurniture.put("settee_", "Sofa %s");
        colorFurniture.put("sofa_", "Couch %s");
        colorFurniture.put("cushion_", "Kissen %s");

        Map<String, String> woodenFurniture = new LinkedHashMap<>();
        woodenFurniture.put("simple_chair_", "Stuhl aus %s");
        woodenFurniture.put("simple_stool_", "Hocker aus %s");
        woodenFurniture.put("simple_bench_", "Bank aus %s");
        woodenFurniture.put("seating_log_", "Sitz aus %s");

        Map<String, String> stoneFurniture = new LinkedHashMap<>();
        stoneFurniture.put("stone_bench_", "Bank aus %s");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "schwarzer Farbe");
        colors.put("brown", "brauner Farbe");
        colors.put("gray", "grauer Farbe");
        colors.put("light_gray", "hellgrauer Farbe");
        colors.put("white", "weißer Farbe");
        colors.put("red", "roter Farbe");
        colors.put("orange", "orangener Farbe");
        colors.put("yellow", "gelber Farbe");
        colors.put("blue", "blauer Farbe");
        colors.put("cyan", "türkiser Farbe");
        colors.put("light_blue", "hellblauer Farbe");
        colors.put("purple", "violetter Farbe");
        colors.put("magenta", "magenta Farbe");
        colors.put("pink", "rosa Farbe");
        colors.put("green", "grüner Farbe");
        colors.put("lime", "limonengrüner Farbe");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "Stein");
        stoneMaterials.put("tuff", "Tuffstein");
        stoneMaterials.put("blackstone", "Schwarzstein");
        stoneMaterials.put("andesite", "Andesit");
        stoneMaterials.put("diorite", "Diorit");
        stoneMaterials.put("granite", "Granit");
        stoneMaterials.put("deepslate", "Tiefenschiefer");
        stoneMaterials.put("basalt_side", "Basalt");
        stoneMaterials.put("quartz_block_bottom", "Quarz");
        stoneMaterials.put("stone_bricks", "Steinziegeln");
        stoneMaterials.put("bricks", "Ziegeln");
        stoneMaterials.put("mud_bricks", "Lehmziegeln");
        stoneMaterials.put("sandstone", "Sandstein");
        stoneMaterials.put("dolomite_block", "Dolomit");
        stoneMaterials.put("saltmarsh_block", "Salzmoorstein");
        stoneMaterials.put("loessic_marl_block", "Lössmergel");
        stoneMaterials.put("loamy_marl_block", "Tonmergel");
        stoneMaterials.put("fossil_marlstone_block", "Fossilmergel");
        stoneMaterials.put("limestone_block", "Kalkstein");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "Sumpfzypresse");
        woodMaterials.put("thuja", "Thuja");
        woodMaterials.put("sequoia", "Mammutbaum");
        woodMaterials.put("mountain_hemlock", "Berg-Hemlocktanne");
        woodMaterials.put("cryptomeria", "Sicheltanne");
        woodMaterials.put("yew", "Eibe");
        woodMaterials.put("larch", "Lärche");
        woodMaterials.put("olive", "Olive");
        woodMaterials.put("tamarisk", "Tamariske");
        woodMaterials.put("western_serviceberry", "Felsenbirne");
        woodMaterials.put("trembling_aspen", "Zitterpappel");
        woodMaterials.put("cottonwood", "Pappel");
        woodMaterials.put("walnut", "Walnuss");
        woodMaterials.put("silver_maple", "Silberahorn");
        woodMaterials.put("staghorn_sumac", "Essigbaum");
        woodMaterials.put("silverberry", "Silberölweide");
        woodMaterials.put("willow", "Weide");
        woodMaterials.put("poplar", "Pappel");
        woodMaterials.put("alder", "Erle");
        woodMaterials.put("aspen", "Espe");
        woodMaterials.put("azalea", "Azalee");
        woodMaterials.put("apple", "Apfelbaum");
        woodMaterials.put("scots_pine", "Waldkiefer");
        woodMaterials.put("swamp_oak", "Sumpfeiche");
        woodMaterials.put("aspen_nss", "Espe");
        woodMaterials.put("cedar_nss", "Zeder");
        woodMaterials.put("coconut_nss", "Kokospalme");
        woodMaterials.put("cypress_nss", "Zypresse");
        woodMaterials.put("fir_nss", "Tanne");
        woodMaterials.put("ghaf_nss", "Ghaf-Baum");
        woodMaterials.put("larch_nss", "Lärche");
        woodMaterials.put("mahogany_nss", "Mahagoni");
        woodMaterials.put("maple_nss", "Ahorn");
        woodMaterials.put("olive_nss", "Olive");
        woodMaterials.put("palo_verde_nss", "Palo-Verde-Baum");
        woodMaterials.put("redwood_nss", "Küstenmammutbaum");
        woodMaterials.put("saxaul_nss", "Saxaul");
        woodMaterials.put("sugi_nss", "Sugi-Zypresse");
        woodMaterials.put("willow_nss", "Weide");
        woodMaterials.put("wisteria_nss", "Glyzinie");
        woodMaterials.put("oak", "Eiche");
        woodMaterials.put("birch", "Birke");
        woodMaterials.put("spruce", "Fichte");
        woodMaterials.put("jungle", "Tropenholz");
        woodMaterials.put("acacia", "Akazie");
        woodMaterials.put("dark_oak", "Dunkeleiche");
        woodMaterials.put("crimson", "Karmesinholz");
        woodMaterials.put("warped", "Wirrholz");
        woodMaterials.put("mangrove", "Mangrove");
        woodMaterials.put("cherry", "Kirsche");
        woodMaterials.put("bamboo", "Bambus");
        woodMaterials.put("hazelnut", "Hasel");
        woodMaterials.put("hornbeam", "Hainbuche");
        woodMaterials.put("hawthorn", "Weißdorn");
        woodMaterials.put("quince", "Quitte");
        woodMaterials.put("plum", "Pflaume");
        woodMaterials.put("mango", "Mango");
        woodMaterials.put("fig", "Feige");
        woodMaterials.put("viburnum", "Schneeball");
        woodMaterials.put("white_mulberry", "Weiße Maulbeere");
        woodMaterials.put("wild_cherry", "Vogelkirsche");
        woodMaterials.put("bauhinia", "Bauhinie");
        woodMaterials.put("pine", "Kiefer");
        woodMaterials.put("fir", "Tanne");
        woodMaterials.put("cedar", "Zeder");
        woodMaterials.put("araucaria", "Araukarie");
        woodMaterials.put("juniper", "Wacholder");

        add("item." + AestheticSeating.MOD_ID + ".cushion_remover", "Kissenentferner");
        add("item." + AestheticSeating.MOD_ID + ".wrench", "Schraubenschlüssel");


        for (Map.Entry<String, String> type : stoneFurniture.entrySet())
        {
            for (Map.Entry<String, String> mat : stoneMaterials.entrySet())
            {
                String key = "block." + AestheticSeating.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                add(key, value);
            }
        }

        for (Map.Entry<String, String> type : woodenFurniture.entrySet())
        {
            for (Map.Entry<String, String> mat : woodMaterials.entrySet())
            {
                String key = "block." + AestheticSeating.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                add(key, value);
            }
        }

        for (Map.Entry<String, String> type : colorFurniture.entrySet())
        {
            for (Map.Entry<String, String> mat : colors.entrySet())
            {
                String key = "block." + AestheticSeating.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                add(key, value);
            }
        }

        add("itemGroup.aestheticseating.aseattab", "Aesthetic Seating");
    }
}