package com.koblizek.skypixel.items;

import org.bukkit.ChatColor;

public final class ItemUtil {
    public enum ItemType {
        HELMET,
        HAT,
        CHESTPLATE,
        LEGGINGS,
        BOOTS,
        SWORD,
        LONGSWORD,
        BOW,
        SHORTBOW,
        WAND,
        ENRICHMENT,
        ACCESSORY
    }
    public enum ItemRarity {
        COMMON(ChatColor.WHITE),
        UNCOMMON(ChatColor.GREEN),
        RARE(ChatColor.BLUE),
        EPIC(ChatColor.DARK_PURPLE),
        LEGENDARY(ChatColor.GOLD),
        MYTHIC(ChatColor.LIGHT_PURPLE),
        DIVINE(ChatColor.AQUA),
        SPECIAL(ChatColor.RED),
        VERY_SPECIAL(ChatColor.RED),
        SPIGOT(ChatColor.YELLOW);

        private final String boldColor;
        ItemRarity(ChatColor color) {
            this.boldColor = "&"+color.getChar()+"&l";
        }
        public String getBoldColor() {
            return boldColor;
        }
    }
}
