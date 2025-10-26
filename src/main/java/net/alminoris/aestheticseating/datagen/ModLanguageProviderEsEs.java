package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.AestheticSeating;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderEsEs extends LanguageProvider
{
    public ModLanguageProviderEsEs(DataGenerator output)
    {
        super(output, AestheticSeating.MOD_ID, "es_es");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> colorFurniture = new LinkedHashMap<>();
        colorFurniture.put("settee_", "Sofá %s");
        colorFurniture.put("sofa_", "Diván %s");
        colorFurniture.put("cushion_", "Cojín %s");

        Map<String, String> woodenFurniture = new LinkedHashMap<>();
        woodenFurniture.put("simple_chair_", "Silla de %s");
        woodenFurniture.put("simple_stool_", "Taburete de %s");
        woodenFurniture.put("simple_bench_", "Banco de %s");
        woodenFurniture.put("seating_log_", "Asiento de %s");

        Map<String, String> stoneFurniture = new LinkedHashMap<>();
        stoneFurniture.put("stone_bench_", "Banco de %s");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "de color negro");
        colors.put("brown", "de color marrón");
        colors.put("gray", "de color gris");
        colors.put("light_gray", "de color gris claro");
        colors.put("white", "de color blanco");
        colors.put("red", "de color rojo");
        colors.put("orange", "de color naranja");
        colors.put("yellow", "de color amarillo");
        colors.put("blue", "de color azul");
        colors.put("cyan", "de color cian");
        colors.put("light_blue", "de color azul claro");
        colors.put("purple", "de color violeta");
        colors.put("magenta", "de color magenta");
        colors.put("pink", "de color rosa");
        colors.put("green", "de color verde");
        colors.put("lime", "de color lima");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "piedra");
        stoneMaterials.put("tuff", "toba");
        stoneMaterials.put("blackstone", "piedra negra");
        stoneMaterials.put("andesite", "andesita");
        stoneMaterials.put("diorite", "diorita");
        stoneMaterials.put("granite", "granito");
        stoneMaterials.put("deepslate", "pizarra profunda");
        stoneMaterials.put("basalt_side", "basalto");
        stoneMaterials.put("quartz_block_bottom", "cuarzo");
        stoneMaterials.put("stone_bricks", "ladrillos de piedra");
        stoneMaterials.put("bricks", "ladrillos");
        stoneMaterials.put("mud_bricks", "ladrillos de barro");
        stoneMaterials.put("sandstone", "arenisca");
        stoneMaterials.put("dolomite_block", "dolomita");
        stoneMaterials.put("saltmarsh_block", "salina");
        stoneMaterials.put("loessic_marl_block", "marga loésica");
        stoneMaterials.put("loamy_marl_block", "marga arcillosa");
        stoneMaterials.put("fossil_marlstone_block", "marga fósil");
        stoneMaterials.put("limestone_block", "caliza");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "ciprés de pantano");
        woodMaterials.put("thuja", "tuya");
        woodMaterials.put("sequoia", "secuoya");
        woodMaterials.put("mountain_hemlock", "tsuga de montaña");
        woodMaterials.put("cryptomeria", "criptomeria");
        woodMaterials.put("yew", "tejo");
        woodMaterials.put("larch", "alerce");
        woodMaterials.put("olive", "olivo");
        woodMaterials.put("tamarisk", "tamarisco");
        woodMaterials.put("western_serviceberry", "amelanchier occidental");
        woodMaterials.put("trembling_aspen", "álamo temblón");
        woodMaterials.put("cottonwood", "álamo algodonero");
        woodMaterials.put("walnut", "nogal");
        woodMaterials.put("silver_maple", "arce plateado");
        woodMaterials.put("staghorn_sumac", "zumaque cornudo");
        woodMaterials.put("silverberry", "eleagno plateado");
        woodMaterials.put("willow", "sauce");
        woodMaterials.put("poplar", "álamo");
        woodMaterials.put("alder", "aliso");
        woodMaterials.put("aspen", "álamo");
        woodMaterials.put("azalea", "azalea");
        woodMaterials.put("apple", "manzano");
        woodMaterials.put("scots_pine", "pino silvestre");
        woodMaterials.put("swamp_oak", "roble pantanoso");
        woodMaterials.put("aspen_nss", "álamo");
        woodMaterials.put("cedar_nss", "cedro");
        woodMaterials.put("coconut_nss", "palmera de coco");
        woodMaterials.put("cypress_nss", "ciprés");
        woodMaterials.put("fir_nss", "abeto");
        woodMaterials.put("ghaf_nss", "ghaf");
        woodMaterials.put("larch_nss", "alerce");
        woodMaterials.put("mahogany_nss", "caoba");
        woodMaterials.put("maple_nss", "arce");
        woodMaterials.put("olive_nss", "olivo");
        woodMaterials.put("palo_verde_nss", "palo verde");
        woodMaterials.put("redwood_nss", "secuoya roja");
        woodMaterials.put("saxaul_nss", "saxaul");
        woodMaterials.put("sugi_nss", "cedro japonés");
        woodMaterials.put("willow_nss", "sauce");
        woodMaterials.put("wisteria_nss", "glicinia");
        woodMaterials.put("oak", "roble");
        woodMaterials.put("birch", "abedul");
        woodMaterials.put("spruce", "abeto");
        woodMaterials.put("jungle", "madera tropical");
        woodMaterials.put("acacia", "acacia");
        woodMaterials.put("dark_oak", "roble oscuro");
        woodMaterials.put("crimson", "madera carmesí");
        woodMaterials.put("warped", "madera distorsionada");
        woodMaterials.put("mangrove", "mangle");
        woodMaterials.put("cherry", "cerezo");
        woodMaterials.put("bamboo", "bambú");
        woodMaterials.put("hazelnut", "avellano");
        woodMaterials.put("hornbeam", "carpe");
        woodMaterials.put("hawthorn", "espino");
        woodMaterials.put("quince", "membrillo");
        woodMaterials.put("plum", "ciruelo");
        woodMaterials.put("mango", "mango");
        woodMaterials.put("fig", "higuera");
        woodMaterials.put("viburnum", "viburno");
        woodMaterials.put("white_mulberry", "morera blanca");
        woodMaterials.put("wild_cherry", "cerezo silvestre");
        woodMaterials.put("bauhinia", "bauhinia");
        woodMaterials.put("pine", "pino");
        woodMaterials.put("fir", "abeto");
        woodMaterials.put("cedar", "cedro");
        woodMaterials.put("araucaria", "araucaria");
        woodMaterials.put("juniper", "enebro");

        add("item." + AestheticSeating.MOD_ID + ".cushion_remover", "Quitacojines");
        add("item." + AestheticSeating.MOD_ID + ".wrench", "Llave inglesa");


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