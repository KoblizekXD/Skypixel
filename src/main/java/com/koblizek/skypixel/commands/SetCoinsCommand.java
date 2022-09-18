package com.koblizek.skypixel.commands;

import com.koblizek.skypixel.core.SkyblockPlayer;
import com.koblizek.skypixel.core.util.PlayerList;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SetCoinsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        SkyblockPlayer player = PlayerList.PLAYERS.getSkyblockPlayer((Player) sender);
        if (args[0].equalsIgnoreCase("purse")) {
            player.getPurse().addAmount(Integer.parseInt(args[1]));
        } else {
            player.getBank().addAmount(Integer.parseInt(args[1]));
        }
        return true;
    }
}
