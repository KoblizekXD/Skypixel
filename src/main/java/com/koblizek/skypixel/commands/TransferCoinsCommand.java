package com.koblizek.skypixel.commands;

import com.koblizek.skypixel.core.SkyblockPlayer;
import com.koblizek.skypixel.core.util.PlayerList;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class TransferCoinsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        SkyblockPlayer player = PlayerList.PLAYERS.getSkyblockPlayer((Player) sender);
        if (args[0].equalsIgnoreCase("purse")) {
            player.getPurse().transfer(player.getBank(), Integer.parseInt(args[1]));
        } else {
            player.getBank().transfer(player.getPurse(), Integer.parseInt(args[1]));
        }
        return true;
    }
}
