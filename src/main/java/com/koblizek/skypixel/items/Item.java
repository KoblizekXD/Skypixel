package com.koblizek.skypixel.items;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface Item {
    Player player = null;

    default void giveTo(Player player) {

    }
}
