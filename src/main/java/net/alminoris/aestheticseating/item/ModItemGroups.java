package net.alminoris.aestheticseating.item;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.ModList;

import java.util.ArrayList;
import java.util.List;

public class ModItemGroups
{
    public static List<String> WF_WOOD_NAMES = List.of("olive", "tamarisk", "western_serviceberry", "trembling_aspen", "cottonwood");

    public static List<String> AN_WOOD_NAMES = List.of("hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum",
            "white_mulberry", "wild_cherry", "bauhinia", "pine", "fir", "cedar", "araucaria", "juniper",
            "bald_cypress", "thuja", "sequoia", "mountain_hemlock", "cryptomeria", "yew", "larch");

    public static List<String> EXTRA_STONES_WF = List.of("dolomite_block", "saltmarsh_block", "loessic_marl_block", "loamy_marl_block", "fossil_marlstone_block", "limestone_block");

    public static List<String> ST_WOOD_NAMES = List.of( "walnut", "silver_maple", "staghorn_sumac", "silverberry");

    public static List<String> WT_WOOD_NAMES = List.of("willow", "poplar", "alder", "aspen");

    public static List<String> MT_WOOD_NAMES = List.of("azalea", "apple", "scots_pine", "swamp_oak");

    public static List<String> NSS_WOOD_NAMES = List.of("aspen_nss", "cedar_nss", "coconut_nss", "cypress_nss", "fir_nss", "ghaf_nss",
            "larch_nss", "mahogany_nss", "maple_nss", "olive_nss", "palo_verde_nss", "redwood_nss", "saxaul_nss", "sugi_nss", "willow_nss", "wisteria_nss");

    public static final CreativeModeTab ASEAT_TAB = new CreativeModeTab(AestheticSeating.MOD_ID + ".aseattab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.SIMPLE_CHAIRS.get("oak").get().asItem());
        }

        @Override
        public Component getDisplayName() {
            return new TranslatableComponent("itemGroup." + AestheticSeating.MOD_ID + ".aseattab");
        }
    };

    public static void registerModItemGroups()
    {
        WF_WOOD_NAMES = new ArrayList<>();

        AN_WOOD_NAMES = new ArrayList<>();

        EXTRA_STONES_WF = new ArrayList<>();

        ST_WOOD_NAMES = new ArrayList<>();

        WT_WOOD_NAMES = new ArrayList<>();

        MT_WOOD_NAMES = new ArrayList<>();

        NSS_WOOD_NAMES = new ArrayList<>();

        if (ModList.get().isLoaded("arborealnature"))
        {
            AN_WOOD_NAMES = List.of("hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum",
                    "white_mulberry", "wild_cherry", "bauhinia", "pine", "fir", "cedar", "araucaria", "juniper");
        }
        if (ModList.get().isLoaded("wildfields"))
        {
            WF_WOOD_NAMES = List.of("olive", "tamarisk", "western_serviceberry");
            EXTRA_STONES_WF = List.of("dolomite_block", "saltmarsh_block", "loessic_marl_block", "loamy_marl_block", "fossil_marlstone_block");
        }
        if (ModList.get().isLoaded("silverwoodtrees"))
        {
            ST_WOOD_NAMES = List.of( "walnut", "silver_maple", "staghorn_sumac", "silverberry");
        }
        if (ModList.get().isLoaded("whisperleaftrees"))
        {
            WT_WOOD_NAMES = List.of("willow", "poplar", "alder", "aspen");
        }
        if (ModList.get().isLoaded("missingtrees"))
        {
            MT_WOOD_NAMES = List.of("azalea", "apple", "scots_pine", "swamp_oak");
        }
        if (ModList.get().isLoaded("natures_spirit"))
        {
            NSS_WOOD_NAMES = List.of("aspen_nss", "cedar_nss", "coconut_nss", "cypress_nss", "fir_nss", "ghaf_nss",
                    "larch_nss", "mahogany_nss", "maple_nss", "olive_nss", "palo_verde_nss", "redwood_nss", "saxaul_nss", "sugi_nss", "willow_nss", "wisteria_nss");
        }
    }
}