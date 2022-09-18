package com.koblizek.skypixel.core;

import com.koblizek.skypixel.player.Bank;
import com.koblizek.skypixel.player.PlayerLocation;
import com.koblizek.skypixel.player.Purse;
import org.bukkit.entity.Player;

import java.util.List;

public class SkyblockPlayer {

    private final Player player;
    private final Purse purse;
    private final Bank bank;
    private PlayerLocation location;

    public SkyblockPlayer(Player player) {
        this.player = player;
        purse = new Purse();
        bank = new Bank();
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
    public Bank getBank() {
        return bank;
    }
    public Purse getPurse() {
        return purse;
    }
}
