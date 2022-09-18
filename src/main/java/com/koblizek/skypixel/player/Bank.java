package com.koblizek.skypixel.player;

import com.koblizek.skypixel.core.util.Gettable;
import com.koblizek.skypixel.core.util.TradeableEconomyElement;

public class Bank implements TradeableEconomyElement, Gettable<Integer> {
    private int COINS;

    public Bank() {
        COINS = 100;
    }

    @Override
    public void transfer(TradeableEconomyElement element, int amount) {
        if (amount > COINS) return;
        element.addAmount(amount);
        COINS = COINS - amount;
    }

    @Override
    public void transferAll(TradeableEconomyElement element) {
        element.addAmount(COINS);
        COINS = 0;
    }

    @Override
    public void set(int amount) {
        COINS = amount;
    }

    @Override
    public void addAmount(int amount) {
        COINS = COINS + amount;
    }

    @Override
    public void removeAmount(int amount) {
        if (amount > COINS) return;
        COINS = COINS - amount;
    }

    @Override
    public void clear() {
        COINS = 0;
    }

    @Override
    public Integer get() {
        return COINS;
    }
}
