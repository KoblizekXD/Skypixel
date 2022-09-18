package com.koblizek.skypixel.player;

import org.bukkit.ChatColor;

public enum PlayerLocation {
    HIGH_LEVEL(ChatColor.RED),
    OPEN_WORLD(ChatColor.AQUA),
    HUB(ChatColor.GREEN),
    YOUR_ISLAND(ChatColor.GREEN),
    THE_CATACOMBS(ChatColor.RED);
    private final ChatColor color;
    PlayerLocation(ChatColor color) {
        this.color = color;
    }
    public ChatColor getColor() {
        return color;
    }
}
