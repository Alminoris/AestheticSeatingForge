package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.AestheticSeating;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderRuRu extends LanguageProvider
{
    public ModLanguageProviderRuRu(DataGenerator output)
    {
        super(output, AestheticSeating.MOD_ID, "ru_ru");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> colorFurniture = new LinkedHashMap<>();
        colorFurniture.put("settee_", "Канапе %s");
        colorFurniture.put("sofa_", "Диван %s");
        colorFurniture.put("cushion_", "Подушка %s");

        Map<String, String> woodenFurniture = new LinkedHashMap<>();
        woodenFurniture.put("simple_chair_", "Стул из %s");
        woodenFurniture.put("simple_stool_", "Табурет из %s");
        woodenFurniture.put("simple_bench_", "Скамья из %s");
        woodenFurniture.put("seating_log_", "Сиденье из %s");

        Map<String, String> stoneFurniture = new LinkedHashMap<>();
        stoneFurniture.put("stone_bench_", "Скамья из %s");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "чёрного цвета");
        colors.put("brown", "коричневого цвета");
        colors.put("gray", "серого цвета");
        colors.put("light_gray", "светло-серого цвета");
        colors.put("white", "белого цвета");
        colors.put("red", "красного цвета");
        colors.put("orange", "оранжевого цвета");
        colors.put("yellow", "жёлтого цвета");
        colors.put("blue", "синего цвета");
        colors.put("cyan", "бирюзового цвета");
        colors.put("light_blue", "голубого цвета");
        colors.put("purple", "фиолетового цвета");
        colors.put("magenta", "пурпурного цвета");
        colors.put("pink", "розового цвета");
        colors.put("green", "зелёного цвета");
        colors.put("lime", "лаймового цвета");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "камня");
        stoneMaterials.put("tuff", "туфа");
        stoneMaterials.put("blackstone", "чёрного камня");
        stoneMaterials.put("andesite", "андезита");
        stoneMaterials.put("diorite", "диорита");
        stoneMaterials.put("granite", "гранита");
        stoneMaterials.put("deepslate", "глубинного сланца");
        stoneMaterials.put("basalt_side", "базальта");
        stoneMaterials.put("quartz_block_bottom", "кварца");
        stoneMaterials.put("stone_bricks", "каменного кирпича");
        stoneMaterials.put("bricks", "кирпича");
        stoneMaterials.put("mud_bricks", "глиняного кирпича");
        stoneMaterials.put("sandstone", "песчаника");
        stoneMaterials.put("dolomite_block", "доломита");
        stoneMaterials.put("saltmarsh_block", "солончака");
        stoneMaterials.put("loessic_marl_block", "лёссового мергеля");
        stoneMaterials.put("loamy_marl_block", "суглинистого мергеля");
        stoneMaterials.put("fossil_marlstone_block", "ископаемого мергеля");
        stoneMaterials.put("limestone_block", "известняка");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "болотного кипариса");
        woodMaterials.put("thuja", "туи");
        woodMaterials.put("sequoia", "секвойи");
        woodMaterials.put("mountain_hemlock", "горной тсуги");
        woodMaterials.put("cryptomeria", "криптомерии");
        woodMaterials.put("yew", "тиса");
        woodMaterials.put("larch", "лиственницы");
        woodMaterials.put("olive", "оливы");
        woodMaterials.put("tamarisk", "тамариска");
        woodMaterials.put("western_serviceberry", "ирги западной");
        woodMaterials.put("trembling_aspen", "осины");
        woodMaterials.put("cottonwood", "тополя хлопкового");
        woodMaterials.put("walnut", "грецкого ореха");
        woodMaterials.put("silver_maple", "серебристого клёна");
        woodMaterials.put("staghorn_sumac", "сумаха оленерогого");
        woodMaterials.put("silverberry", "лохины серебристой");
        woodMaterials.put("willow", "ивы");
        woodMaterials.put("poplar", "тополя");
        woodMaterials.put("alder", "ольхи");
        woodMaterials.put("aspen", "осины");
        woodMaterials.put("azalea", "азалии");
        woodMaterials.put("apple", "яблони");
        woodMaterials.put("scots_pine", "сосны обыкновенной");
        woodMaterials.put("swamp_oak", "болотного дуба");
        woodMaterials.put("aspen_nss", "осины");
        woodMaterials.put("cedar_nss", "кедра");
        woodMaterials.put("coconut_nss", "кокосовой пальмы");
        woodMaterials.put("cypress_nss", "кипариса");
        woodMaterials.put("fir_nss", "пихты");
        woodMaterials.put("ghaf_nss", "гафа");
        woodMaterials.put("larch_nss", "лиственницы");
        woodMaterials.put("mahogany_nss", "махагона");
        woodMaterials.put("maple_nss", "клёна");
        woodMaterials.put("olive_nss", "оливы");
        woodMaterials.put("palo_verde_nss", "пало верде");
        woodMaterials.put("redwood_nss", "секвойи");
        woodMaterials.put("saxaul_nss", "саксаула");
        woodMaterials.put("sugi_nss", "суги");
        woodMaterials.put("willow_nss", "ивы");
        woodMaterials.put("wisteria_nss", "глицинии");
        woodMaterials.put("oak", "дуба");
        woodMaterials.put("birch", "берёзы");
        woodMaterials.put("spruce", "ели");
        woodMaterials.put("jungle", "тропического дерева");
        woodMaterials.put("acacia", "акации");
        woodMaterials.put("dark_oak", "тёмного дуба");
        woodMaterials.put("crimson", "багрового дерева");
        woodMaterials.put("warped", "искажённого дерева");
        woodMaterials.put("mangrove", "мангрового дерева");
        woodMaterials.put("cherry", "вишни");
        woodMaterials.put("bamboo", "бамбука");
        woodMaterials.put("hazelnut", "лещины");
        woodMaterials.put("hornbeam", "граба");
        woodMaterials.put("hawthorn", "боярышника");
        woodMaterials.put("quince", "айвы");
        woodMaterials.put("plum", "сливы");
        woodMaterials.put("mango", "манго");
        woodMaterials.put("fig", "инжира");
        woodMaterials.put("viburnum", "калины");
        woodMaterials.put("white_mulberry", "белой шелковицы");
        woodMaterials.put("wild_cherry", "черешни");
        woodMaterials.put("bauhinia", "баухинии");
        woodMaterials.put("pine", "сосны");
        woodMaterials.put("fir", "ели");
        woodMaterials.put("cedar", "кедра");
        woodMaterials.put("araucaria", "араукарии");
        woodMaterials.put("juniper", "можжевельника");

        add("item." + AestheticSeating.MOD_ID + ".cushion_remover", "Съёмник подушек");
        add("item." + AestheticSeating.MOD_ID + ".wrench", "Гаечный ключ");

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