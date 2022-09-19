package com.koblizek.skypixel.commands;

import com.koblizek.skypixel.core.util.PlayerList;
import com.koblizek.skypixel.player.PlayerLocation;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SetLocationCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage(
                    Arrays.toString(PlayerLocation.values())
            );
        }
        PlayerList.PLAYERS.getSkyblockPlayer(player).setLocation(PlayerLocation.valueOf(args[0]));
        return true;
    }
}
