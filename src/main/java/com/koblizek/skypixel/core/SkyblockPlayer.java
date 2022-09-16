package com.koblizek.skypixel.core;

import org.bukkit.entity.Player;

import java.util.List;

public class SkyblockPlayer {

    private final Player player;

    public SkyblockPlayer(Player player) {
        this.player = player;
    }
    public Player toPlayer() {
        return player;
    }
}
