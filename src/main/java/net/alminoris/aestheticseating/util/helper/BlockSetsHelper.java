package net.alminoris.aestheticseating.util.helper;

import net.alminoris.aestheticseating.item.ModItemGroups;

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

    public static final String[] WOODS =
            {
                    "oak", "birch", "spruce", "jungle", "acacia", "dark_oak",
                    "crimson", "warped", "mangrove"
            };

    public static String[] getWoods()
    {
        int totalSize = WOODS.length
                + ModItemGroups.AN_WOOD_NAMES.size()
                + ModItemGroups.WF_WOOD_NAMES.size()
                + ModItemGroups.ST_WOOD_NAMES.size()
                + ModItemGroups.WT_WOOD_NAMES.size()
                + ModItemGroups.MT_WOOD_NAMES.size()
                + ModItemGroups.NSS_WOOD_NAMES.size();

        String[] combinedWoods = new String[totalSize];

        int currentIndex = 0;

        System.arraycopy(WOODS, 0, combinedWoods, currentIndex, WOODS.length);
        currentIndex += WOODS.length;

        System.arraycopy(ModItemGroups.AN_WOOD_NAMES.toArray(new String[0]), 0, combinedWoods, currentIndex, ModItemGroups.AN_WOOD_NAMES.size());
        currentIndex += ModItemGroups.AN_WOOD_NAMES.size();

        System.arraycopy(ModItemGroups.WF_WOOD_NAMES.toArray(new String[0]), 0, combinedWoods, currentIndex, ModItemGroups.WF_WOOD_NAMES.size());
        currentIndex += ModItemGroups.WF_WOOD_NAMES.size();

        System.arraycopy(ModItemGroups.ST_WOOD_NAMES.toArray(new String[0]), 0, combinedWoods, currentIndex, ModItemGroups.ST_WOOD_NAMES.size());
        currentIndex += ModItemGroups.ST_WOOD_NAMES.size();

        System.arraycopy(ModItemGroups.WT_WOOD_NAMES.toArray(new String[0]), 0, combinedWoods, currentIndex, ModItemGroups.WT_WOOD_NAMES.size());
        currentIndex += ModItemGroups.WT_WOOD_NAMES.size();

        System.arraycopy(ModItemGroups.MT_WOOD_NAMES.toArray(new String[0]), 0, combinedWoods, currentIndex, ModItemGroups.MT_WOOD_NAMES.size());
        currentIndex += ModItemGroups.MT_WOOD_NAMES.size();

        System.arraycopy(ModItemGroups.NSS_WOOD_NAMES.toArray(new String[0]), 0, combinedWoods, currentIndex, ModItemGroups.NSS_WOOD_NAMES.size());

        return combinedWoods;
    }

    public static String[] getStones()
    {
        int totalSize = STONES.length + ModItemGroups.EXTRA_STONES_WF.size();

        String[] combinedStones = new String[totalSize];

        int currentIndex = 0;

        System.arraycopy(STONES, 0, combinedStones, currentIndex, STONES.length);
        currentIndex += STONES.length;

        System.arraycopy(ModItemGroups.EXTRA_STONES_WF.toArray(new String[0]), 0, combinedStones, currentIndex, ModItemGroups.EXTRA_STONES_WF.size());

        return combinedStones;
    }
}
