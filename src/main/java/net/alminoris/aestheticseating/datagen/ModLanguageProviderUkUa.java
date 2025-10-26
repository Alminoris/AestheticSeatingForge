package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.AestheticSeating;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderUkUa extends LanguageProvider
{
    public ModLanguageProviderUkUa(DataGenerator output)
    {
        super(output, AestheticSeating.MOD_ID, "uk_ua");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> colorFurniture = new LinkedHashMap<>();
        colorFurniture.put("settee_", "Канапа %s");
        colorFurniture.put("sofa_", "Диван %s");
        colorFurniture.put("cushion_", "Подушка %s");

        Map<String, String> woodenFurniture = new LinkedHashMap<>();
        woodenFurniture.put("simple_chair_", "Стілець з %s");
        woodenFurniture.put("simple_stool_", "Табурет з %s");
        woodenFurniture.put("simple_bench_", "Лавка з %s");
        woodenFurniture.put("seating_log_", "Сидіння з %s");

        Map<String, String> stoneFurniture = new LinkedHashMap<>();
        stoneFurniture.put("stone_bench_", "Лавка з %s");

        Map<String, String> colors = new LinkedHashMap<>();
        colors.put("black", "чорного кольору");
        colors.put("brown", "коричневого кольору");
        colors.put("gray", "сірого кольору");
        colors.put("light_gray", "світло-сірого кольору");
        colors.put("white", "білого кольору");
        colors.put("red", "бервоного кольору");
        colors.put("orange", "оранжевого кольору");
        colors.put("yellow", "жовтого кольору");
        colors.put("blue", "синя кольору");
        colors.put("cyan", "бірюзового кольору");
        colors.put("light_blue", "блакитного кольору");
        colors.put("purple", "фіолетового кольору");
        colors.put("magenta", "пурпурного кольору");
        colors.put("pink", "рожевого кольору");
        colors.put("green", "зеленого кольору");
        colors.put("lime", "лаймового кольору");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "каменю");
        stoneMaterials.put("tuff", "туфу");
        stoneMaterials.put("blackstone", "чорного каменю");
        stoneMaterials.put("andesite", "андезиту");
        stoneMaterials.put("diorite", "діориту");
        stoneMaterials.put("granite", "граніту");
        stoneMaterials.put("deepslate", "глибокої сланцю");
        stoneMaterials.put("basalt_side", "базальту");
        stoneMaterials.put("quartz_block_bottom", "кварцу");
        stoneMaterials.put("stone_bricks", "кам’яної цегли");
        stoneMaterials.put("bricks", "цегли");
        stoneMaterials.put("mud_bricks", "глиняної цегли");
        stoneMaterials.put("sandstone", "піщанику");
        stoneMaterials.put("dolomite_block", "доломіту");
        stoneMaterials.put("saltmarsh_block", "солончака");
        stoneMaterials.put("loessic_marl_block", "лессового мергеля");
        stoneMaterials.put("loamy_marl_block", "суглинкового мергеля");
        stoneMaterials.put("fossil_marlstone_block", "викопного мергеля");
        stoneMaterials.put("limestone_block", "вапняку");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "болотного кипариса");
        woodMaterials.put("thuja", "туї");
        woodMaterials.put("sequoia", "секвої");
        woodMaterials.put("mountain_hemlock", "гірської тсуги");
        woodMaterials.put("cryptomeria", "криптомерії");
        woodMaterials.put("yew", "тису");
        woodMaterials.put("larch", "модрини");
        woodMaterials.put("olive", "оливи");
        woodMaterials.put("tamarisk", "тамаріску");
        woodMaterials.put("western_serviceberry", "ірги західної");
        woodMaterials.put("trembling_aspen", "осики");
        woodMaterials.put("cottonwood", "тополі бавовникової");
        woodMaterials.put("walnut", "горіха");
        woodMaterials.put("silver_maple", "сріблястого клена");
        woodMaterials.put("staghorn_sumac", "сумаху оленерогого");
        woodMaterials.put("silverberry", "лохини сріблястої");
        woodMaterials.put("willow", "верби");
        woodMaterials.put("poplar", "тополі");
        woodMaterials.put("alder", "вільхи");
        woodMaterials.put("aspen", "осики");
        woodMaterials.put("azalea", "азалії");
        woodMaterials.put("apple", "яблуні");
        woodMaterials.put("scots_pine", "сосни звичайної");
        woodMaterials.put("swamp_oak", "болотного дуба");
        woodMaterials.put("aspen_nss", "осики");
        woodMaterials.put("cedar_nss", "кедра");
        woodMaterials.put("coconut_nss", "кокосової пальми");
        woodMaterials.put("cypress_nss", "кипариса");
        woodMaterials.put("fir_nss", "ялиці");
        woodMaterials.put("ghaf_nss", "гафу");
        woodMaterials.put("larch_nss", "модрини");
        woodMaterials.put("mahogany_nss", "махаґоні");
        woodMaterials.put("maple_nss", "клена");
        woodMaterials.put("olive_nss", "оливи");
        woodMaterials.put("palo_verde_nss", "пало верде");
        woodMaterials.put("redwood_nss", "секвої");
        woodMaterials.put("saxaul_nss", "саксаулу");
        woodMaterials.put("sugi_nss", "суґі");
        woodMaterials.put("willow_nss", "верби");
        woodMaterials.put("wisteria_nss", "гліцинії");
        woodMaterials.put("oak", "дуба");
        woodMaterials.put("birch", "берези");
        woodMaterials.put("spruce", "ялиці");
        woodMaterials.put("jungle", "тропічного дерева");
        woodMaterials.put("acacia", "акації");
        woodMaterials.put("dark_oak", "темного дуба");
        woodMaterials.put("crimson", "пурпурового дерева");
        woodMaterials.put("warped", "деформованого дерева");
        woodMaterials.put("mangrove", "мангрового дерева");
        woodMaterials.put("cherry", "вишні");
        woodMaterials.put("bamboo", "бамбука");
        woodMaterials.put("hazelnut", "ліщини");
        woodMaterials.put("hornbeam", "грабу");
        woodMaterials.put("hawthorn", "глоду");
        woodMaterials.put("quince", "айви");
        woodMaterials.put("plum", "сливи");
        woodMaterials.put("mango", "манго");
        woodMaterials.put("fig", "інжиру");
        woodMaterials.put("viburnum", "калини");
        woodMaterials.put("white_mulberry", "білої шовковиці");
        woodMaterials.put("wild_cherry", "черешні");
        woodMaterials.put("bauhinia", "баухінії");
        woodMaterials.put("pine", "сосни");
        woodMaterials.put("fir", "ялини");
        woodMaterials.put("cedar", "кедра");
        woodMaterials.put("araucaria", "араукарії");
        woodMaterials.put("juniper", "ялівця");

        add("item." + AestheticSeating.MOD_ID + ".cushion_remover","Знімач подушок");
        add("item." + AestheticSeating.MOD_ID + ".wrench","Гайковий ключ");

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