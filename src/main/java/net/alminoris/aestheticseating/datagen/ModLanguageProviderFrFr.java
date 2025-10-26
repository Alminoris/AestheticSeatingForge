package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.AestheticSeating;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderFrFr extends LanguageProvider
{
    public ModLanguageProviderFrFr(DataGenerator output)
    {
        super(output, AestheticSeating.MOD_ID, "fr_fr");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> colorFurniture = new LinkedHashMap<>();
        colorFurniture.put("settee_", "Canapé %s");
        colorFurniture.put("sofa_", "Sofa %s");
        colorFurniture.put("cushion_", "Coussin %s");

        Map<String, String> woodenFurniture = new LinkedHashMap<>();
        woodenFurniture.put("simple_chair_", "Chaise en %s");
        woodenFurniture.put("simple_stool_", "Tabouret en %s");
        woodenFurniture.put("simple_bench_", "Banc en %s");
        woodenFurniture.put("seating_log_", "Siège en %s");

        Map<String, String> stoneFurniture = new LinkedHashMap<>();
        stoneFurniture.put("stone_bench_", "Banc en %s");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "de couleur noire");
        colors.put("brown", "de couleur brune");
        colors.put("gray", "de couleur grise");
        colors.put("light_gray", "de couleur gris clair");
        colors.put("white", "de couleur blanche");
        colors.put("red", "de couleur rouge");
        colors.put("orange", "de couleur orange");
        colors.put("yellow", "de couleur jaune");
        colors.put("blue", "de couleur bleue");
        colors.put("cyan", "de couleur turquoise");
        colors.put("light_blue", "de couleur bleu clair");
        colors.put("purple", "de couleur violette");
        colors.put("magenta", "de couleur magenta");
        colors.put("pink", "de couleur rose");
        colors.put("green", "de couleur verte");
        colors.put("lime", "de couleur vert citron");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "pierre");
        stoneMaterials.put("tuff", "tuf");
        stoneMaterials.put("blackstone", "pierre noire");
        stoneMaterials.put("andesite", "andésite");
        stoneMaterials.put("diorite", "diorite");
        stoneMaterials.put("granite", "granit");
        stoneMaterials.put("deepslate", "ardoise profonde");
        stoneMaterials.put("basalt_side", "basalte");
        stoneMaterials.put("quartz_block_bottom", "quartz");
        stoneMaterials.put("stone_bricks", "briques de pierre");
        stoneMaterials.put("bricks", "briques");
        stoneMaterials.put("mud_bricks", "briques de boue");
        stoneMaterials.put("sandstone", "grès");
        stoneMaterials.put("dolomite_block", "dolomie");
        stoneMaterials.put("saltmarsh_block", "marais salant");
        stoneMaterials.put("loessic_marl_block", "marne lœssique");
        stoneMaterials.put("loamy_marl_block", "marne argileuse");
        stoneMaterials.put("fossil_marlstone_block", "marne fossile");
        stoneMaterials.put("limestone_block", "calcaire");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "cyprès chauve");
        woodMaterials.put("thuja", "thuya");
        woodMaterials.put("sequoia", "séquoia");
        woodMaterials.put("mountain_hemlock", "pruche de montagne");
        woodMaterials.put("cryptomeria", "cryptomérie");
        woodMaterials.put("yew", "if");
        woodMaterials.put("larch", "mélèze");
        woodMaterials.put("olive", "olivier");
        woodMaterials.put("tamarisk", "tamaris");
        woodMaterials.put("western_serviceberry", "amélanchier de l’Ouest");
        woodMaterials.put("trembling_aspen", "peuplier faux-tremble");
        woodMaterials.put("cottonwood", "peuplier deltoïde");
        woodMaterials.put("walnut", "noyer");
        woodMaterials.put("silver_maple", "érable argenté");
        woodMaterials.put("staghorn_sumac", "sumac vinaigrier");
        woodMaterials.put("silverberry", "chalef argenté");
        woodMaterials.put("willow", "saule");
        woodMaterials.put("poplar", "peuplier");
        woodMaterials.put("alder", "aulne");
        woodMaterials.put("aspen", "tremble");
        woodMaterials.put("azalea", "azalée");
        woodMaterials.put("apple", "pommier");
        woodMaterials.put("scots_pine", "pin sylvestre");
        woodMaterials.put("swamp_oak", "chêne des marais");
        woodMaterials.put("aspen_nss", "tremble");
        woodMaterials.put("cedar_nss", "cèdre");
        woodMaterials.put("coconut_nss", "cocotier");
        woodMaterials.put("cypress_nss", "cyprès");
        woodMaterials.put("fir_nss", "sapin");
        woodMaterials.put("ghaf_nss", "ghaf");
        woodMaterials.put("larch_nss", "mélèze");
        woodMaterials.put("mahogany_nss", "acajou");
        woodMaterials.put("maple_nss", "érable");
        woodMaterials.put("olive_nss", "olivier");
        woodMaterials.put("palo_verde_nss", "palo verde");
        woodMaterials.put("redwood_nss", "séquoia");
        woodMaterials.put("saxaul_nss", "saxaul");
        woodMaterials.put("sugi_nss", "sugi");
        woodMaterials.put("willow_nss", "saule");
        woodMaterials.put("wisteria_nss", "glycine");
        woodMaterials.put("oak", "chêne");
        woodMaterials.put("birch", "bouleau");
        woodMaterials.put("spruce", "épicéa");
        woodMaterials.put("jungle", "bois tropical");
        woodMaterials.put("acacia", "acacia");
        woodMaterials.put("dark_oak", "chêne sombre");
        woodMaterials.put("crimson", "bois cramoisi");
        woodMaterials.put("warped", "bois altéré");
        woodMaterials.put("mangrove", "mangrove");
        woodMaterials.put("cherry", "cerisier");
        woodMaterials.put("bamboo", "bambou");
        woodMaterials.put("hazelnut", "noisetier");
        woodMaterials.put("hornbeam", "charme");
        woodMaterials.put("hawthorn", "aubépine");
        woodMaterials.put("quince", "cognassier");
        woodMaterials.put("plum", "prunier");
        woodMaterials.put("mango", "manguier");
        woodMaterials.put("fig", "figuier");
        woodMaterials.put("viburnum", "viorne");
        woodMaterials.put("white_mulberry", "mûrier blanc");
        woodMaterials.put("wild_cherry", "merisier");
        woodMaterials.put("bauhinia", "bauhinie");
        woodMaterials.put("pine", "pin");
        woodMaterials.put("fir", "sapin");
        woodMaterials.put("cedar", "cèdre");
        woodMaterials.put("araucaria", "araucaria");
        woodMaterials.put("juniper", "genévrier");

        add("item." + AestheticSeating.MOD_ID + ".cushion_remover", "Retire-coussins");
        add("item." + AestheticSeating.MOD_ID + ".wrench", "Clé à molette");


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