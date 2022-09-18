package com.koblizek.skypixel.core;

import com.koblizek.skypixel.player.PlayerLocation;
import org.bukkit.entity.Player;

import java.util.List;

public class SkyblockPlayer {

    private final Player player;
    private PlayerLocation location;

    public SkyblockPlayer(Player player) {
        this.player = player;
        location = PlayerLocation.THE_CATACOMBS;
    }
    public Player toPlayer() {
        return player;
    }
    public PlayerLocation getLocation() {
        return location;
    }

    public void setLocation(PlayerLocation location) {
        this.location = location;
    }
}
