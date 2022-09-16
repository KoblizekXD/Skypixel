package com.koblizek.skypixel.core.util;

import com.koblizek.skypixel.core.SkyblockPlayer;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class PlayerList extends ArrayList<SkyblockPlayer> {
    public static final PlayerList PLAYERS = new PlayerList();

    public Player getPlayer(SkyblockPlayer player) {
        for (SkyblockPlayer skyblockPlayer : this) {
            if (skyblockPlayer.toPlayer().equals(player)) {
                return skyblockPlayer.toPlayer();
            }
        }
        return null;
    }
    public void removePlayer(Player player) {
        for (SkyblockPlayer skyblockPlayer : this) {
            if (skyblockPlayer.toPlayer().equals(player)) {
                this.remove(player);
                break;
            }
        }
    }
}
