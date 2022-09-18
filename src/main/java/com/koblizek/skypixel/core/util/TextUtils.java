package com.koblizek.skypixel.core.util;

import com.koblizek.skypixel.items.ItemUtil;
import org.bukkit.ChatColor;

public final class TextUtils {
    private String string;

    private TextUtils(String string) {
        this.string = string;
    }
    @Override
    public String toString() {
        return string;
    }

    public TextUtils set(ChatColor color) {
        string = color + string;
        return this;
    }

    public static TextUtils createNew(String string) {
        return new TextUtils(string);
    }
    public static String replaceCharWith(String string, char a, char b) {
        return string.replace(a, b);
    }
    public static String createRarity(ItemUtil.ItemRarity rarity, ItemUtil.ItemType type, boolean recombobulated) {
        if (!recombobulated) {
            return ChatColor.translateAlternateColorCodes(
                    '&',
                    rarity.getBoldColor() + rarity.toString().replaceAll("_", " ") + " "
                            + type.toString().replaceAll("_", " ")
            );
        } else {
            return ChatColor.translateAlternateColorCodes(
                    '&',
                    rarity.getBoldColor()
                    + "&kX&r "
                    + rarity.getBoldColor()
                    + rarity.toString().replaceAll("_", " ")
                    + " "
                    + type.toString().replaceAll("_", " ")
                    + " "
                    + "&kX"
            );
        }
    }
    public static String addReforgeLoreText() {
        return ChatColor.translateAlternateColorCodes('&', "&7This item can be reforged!");
    }
    public static String capitalizeWord(String str){
        String[] words =str.split("\\s");
        String capitalizeWord = "";
        for(String w : words){
            String first = w.substring(0,1);
            String afterfirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterfirst+" ";
        }
        return capitalizeWord.trim();
    }
}
