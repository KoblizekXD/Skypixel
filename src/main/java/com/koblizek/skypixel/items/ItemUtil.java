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
        LONG_SWORD,
        BOW,
        SHORTBOW,
        WAND
    }
    public enum ItemRarity {
        COMMON(ChatColor.WHITE),
        UNCOMMON(ChatColor.GREEN),
        RARE(ChatColor.BLUE),
        EPIC(ChatColor.DARK_PURPLE),
        LEGENDARY(ChatColor.GOLD),
        DIVINE(ChatColor.AQUA),
        SPECIAL(ChatColor.RED),
        VERY_SPECIAL(ChatColor.RED),
        SPIGOT(ChatColor.YELLOW);

        private final String boldColor;
        ItemRarity(ChatColor color) {
            this.boldColor = ChatColor.BOLD + "" + color;
        }
        public String getBoldColor() {
            return boldColor;
        }
    }
}
