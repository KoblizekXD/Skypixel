package com.koblizek.skypixel.core.util;

public interface TradeableEconomyElement {
    void transfer(TradeableEconomyElement element, int amount);
    void transferAll(TradeableEconomyElement element);
    void set(int amount);
    void addAmount(int amount);
    void removeAmount(int amount);
    void clear();
}
