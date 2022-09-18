package com.koblizek.skypixel.core.util;

import com.koblizek.skypixel.Skypixel;
import com.koblizek.skypixel.core.SkyblockPlayer;
import com.koblizek.skypixel.gui.GuiUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public final class BukkitExecutors {
    private BukkitExecutors() {}

    public static void createNew(SkyblockPlayer player) {
        Bukkit.getServer().getScheduler().runTaskTimer(
                Skypixel.PLUGIN,
                (task) -> {
                    if (!player.toPlayer().isOnline()) task.cancel();
                    GuiUtils.renderClassicScoreboard(player);
                },
                10,
                0
        );
    }
}
