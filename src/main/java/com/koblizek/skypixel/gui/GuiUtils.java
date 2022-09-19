package com.koblizek.skypixel.gui;

import com.koblizek.skypixel.core.SkyblockPlayer;
import com.koblizek.skypixel.core.time.SkyblockDate;
import com.koblizek.skypixel.core.time.SkyblockTime;
import com.koblizek.skypixel.core.util.TextUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;
import org.bukkit.util.StringUtil;
import org.w3c.dom.Text;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public final class GuiUtils {
    private GuiUtils() {}

    public static void renderClassicScoreboard(SkyblockPlayer skyblockPlayer) {
        String formattedDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yy"));
        String serverName = "m69";
        String skyblockDate = TextUtils
                .capitalizeWord(
                        SkyblockDate.Months.values()[SkyblockDate.CURRENT_MONTH-1].getSeason()
                                .toString().replace('_', ' ')
                                .toLowerCase()
                ) + " " + SkyblockDate.CURRENT_DATE + TextUtils.whichOrdinal(SkyblockDate.CURRENT_DATE);
        String skyblockTime = "1:1";

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
        objective.getScore("Purse: " + ChatColor.GOLD + skyblockPlayer.getPurse().get())
                .setScore(3);
        objective.getScore("   ")
                .setScore(2);
        objective.getScore(ChatColor.YELLOW+"www.hypixel.net")
                .setScore(1);
        skyblockPlayer.toPlayer().setScoreboard(scoreboard);
    }
}
