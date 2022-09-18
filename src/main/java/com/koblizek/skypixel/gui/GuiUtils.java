package com.koblizek.skypixel.gui;

import com.koblizek.skypixel.core.SkyblockPlayer;
import com.koblizek.skypixel.core.util.TextUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public final class GuiUtils {
    private GuiUtils() {}

    public static void renderClassicScoreboard(SkyblockPlayer skyblockPlayer) {

        String formattedDate = "1/1/1";
        String serverName = "m000";
        String skyblockDate = "January 1st";
        String skyblockTime = "1:1";
        String playerPosition = "NULL";

        Scoreboard scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective objective = scoreboard.registerNewObjective("skyblock", "dummy", ChatColor.translateAlternateColorCodes('&', "&e&lSKYBLOCK"));
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.getScore(ChatColor.translateAlternateColorCodes('&', "&7" + formattedDate + " &8" + serverName))
                .setScore(9);
        objective.getScore(" ")
                .setScore(8);
        objective.getScore(" " + skyblockDate)
                .setScore(7);
        objective.getScore(" " + ChatColor.GRAY + skyblockTime)
                .setScore(6);
        objective.getScore(" " + ChatColor.GRAY + "⏣ "+ skyblockPlayer.getLocation().getColor() + TextUtils.capitalizeWord(skyblockPlayer.getLocation().toString().replace('_', ' ')
                        .toLowerCase()))
                .setScore(5);
        objective.getScore("  ")
                .setScore(4);
        objective.getScore("BANK INFO TODO")
                .setScore(3);
        objective.getScore("   ")
                .setScore(2);
        objective.getScore(ChatColor.YELLOW+"www.hypixel.net")
                .setScore(1);
        skyblockPlayer.toPlayer().setScoreboard(scoreboard);
    }
}
