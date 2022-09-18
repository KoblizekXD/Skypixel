package com.koblizek.skypixel;

import com.koblizek.skypixel.commands.ReloadScoreboardCommand;
import com.koblizek.skypixel.commands.SetLocationCommand;
import com.koblizek.skypixel.commands.TestItemCommand;
import com.koblizek.skypixel.core.SkyblockPlayer;
import com.koblizek.skypixel.core.util.BukkitExecutors;
import com.koblizek.skypixel.core.util.PlayerList;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Skypixel extends JavaPlugin implements Listener {

    public static Skypixel PLUGIN;

    @Override
    public void onEnable() {
        PLUGIN = this;

        Bukkit.getPluginManager().registerEvents(this, this);
        Bukkit.getPluginCommand("test").setExecutor(new TestItemCommand());
        Bukkit.getPluginCommand("location").setExecutor(new SetLocationCommand());
        Bukkit.getPluginCommand("scoreboardreload").setExecutor(new ReloadScoreboardCommand());
    }

    @Override
    public void onDisable() {
        PLUGIN = null;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        SkyblockPlayer player = new SkyblockPlayer(event.getPlayer());
        PlayerList.PLAYERS.add(player);
        BukkitExecutors.createNew(player);
    }
    @EventHandler
    public void onPlayerLeft(PlayerQuitEvent event) {
        PlayerList.PLAYERS.removePlayer(event.getPlayer());
    }
}
