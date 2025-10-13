package net.alminoris.aestheticseating.util.helper;

public class BlockSetsHelper
{
    public static final String[] COLORS =
            {
                    "black", "brown", "gray", "light_gray",
                    "white", "red", "orange", "yellow",
                    "purple", "magenta", "pink", "blue",
                    "cyan", "light_blue", "green", "lime"
            };

    public static final String[] STONES =
            {
                    "stone", "tuff", "blackstone", "andesite", "diorite", "granite",  "deepslate", "basalt_side",
                    "quartz_block_bottom", "stone_bricks", "bricks", "mud_bricks", "sandstone"
            };

    public static final String[] EXTRA_STONES_WF =
            {
                    "dolomite_block", "saltmarsh_block", "loessic_marl_block", "loamy_marl_block", "fossil_marlstone_block"
            };

    public static final String[] WOODS =
            {
                    "oak", "birch", "spruce", "jungle", "acacia", "dark_oak",
                    "crimson", "warped", "mangrove", "cherry", "bamboo"
            };

    public static final String[] AN_WOOD_NAMES =
            {
                    "hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum", "white_mulberry", "wild_cherry",
                    "bauhinia", "pine", "fir", "cedar", "araucaria", "juniper"
            };

    public static final String[] WF_WOOD_NAMES =
            {
                    "olive", "tamarisk", "western_serviceberry"
            };

    public static final String[] ST_WOOD_NAMES = new String[] { "walnut", "silver_maple", "staghorn_sumac", "silverberry" };

    public static final String[] WT_WOOD_NAMES = new String[] { "willow", "poplar", "alder", "aspen" };

    public static final String[] MT_WOOD_NAMES = new String[] { "azalea", "apple", "scots_pine", "swamp_oak" };

    public static final String[] NSS_WOOD_NAMES = new String[] { "aspen_nss", "cedar_nss", "coconut_nss", "cypress_nss", "fir_nss", "ghaf_nss",
            "larch_nss", "mahogany_nss", "maple_nss", "olive_nss", "palo_verde_nss", "redwood_nss", "saxaul_nss", "sugi_nss", "willow_nss", "wisteria_nss" };

    public static String[] getWoods()
    {
        String[] combinedWoods = new String[WOODS.length + AN_WOOD_NAMES.length + WF_WOOD_NAMES.length+
                ST_WOOD_NAMES.length+ WT_WOOD_NAMES.length+ MT_WOOD_NAMES.length+ NSS_WOOD_NAMES.length];
        System.arraycopy(WOODS, 0, combinedWoods, 0, WOODS.length);
        System.arraycopy(AN_WOOD_NAMES, 0, combinedWoods, WOODS.length, AN_WOOD_NAMES.length);
        System.arraycopy(WF_WOOD_NAMES, 0, combinedWoods, WOODS.length + AN_WOOD_NAMES.length, WF_WOOD_NAMES.length);
        System.arraycopy(ST_WOOD_NAMES, 0, combinedWoods, WOODS.length + AN_WOOD_NAMES.length+WF_WOOD_NAMES.length, ST_WOOD_NAMES.length);
        System.arraycopy(WT_WOOD_NAMES, 0, combinedWoods, WOODS.length + AN_WOOD_NAMES.length+WF_WOOD_NAMES.length
                +ST_WOOD_NAMES.length, WT_WOOD_NAMES.length);
        System.arraycopy(MT_WOOD_NAMES, 0, combinedWoods, WOODS.length + AN_WOOD_NAMES.length+WF_WOOD_NAMES.length
                +ST_WOOD_NAMES.length+WT_WOOD_NAMES.length, MT_WOOD_NAMES.length);
        System.arraycopy(NSS_WOOD_NAMES, 0, combinedWoods, WOODS.length + AN_WOOD_NAMES.length+WF_WOOD_NAMES.length
                +ST_WOOD_NAMES.length+WT_WOOD_NAMES.length+MT_WOOD_NAMES.length, NSS_WOOD_NAMES.length);
        return combinedWoods;
    }

    public static String[] getStones()
    {
        String[] combinedStones = new String[STONES.length + EXTRA_STONES_WF.length];
        System.arraycopy(STONES, 0, combinedStones, 0, STONES.length);
        System.arraycopy(EXTRA_STONES_WF, 0, combinedStones, STONES.length, EXTRA_STONES_WF.length);
        return combinedStones;
    }
}
