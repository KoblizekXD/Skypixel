package com.koblizek.skypixel.commands;

import com.koblizek.skypixel.Skypixel;
import com.koblizek.skypixel.core.SkyblockPlayer;
import com.koblizek.skypixel.core.util.PlayerList;
import com.koblizek.skypixel.player.PlayerLocation;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SetLocationCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        PlayerList.PLAYERS.getSkyblockPlayer(player).setLocation(PlayerLocation.valueOf(args[0]));
        return true;
    }
}
