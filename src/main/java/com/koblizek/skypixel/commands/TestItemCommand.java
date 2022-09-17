package com.koblizek.skypixel.commands;

import com.koblizek.skypixel.core.util.TextUtils;
import com.koblizek.skypixel.items.ItemUtil;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TestItemCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        ItemStack apple = new ItemStack(Material.APPLE);
        ItemMeta meta = apple.getItemMeta();

        meta.setLore(List.of(
                TextUtils.createRarity(ItemUtil.ItemRarity.SPIGOT, ItemUtil.ItemType.WAND, true)
        ));

        apple.setItemMeta(meta);
        player.getInventory().addItem(apple);
        return true;
    }
}
