package com.gildedrose;

public class StrategyFactory {
    private final Item item;

    public StrategyFactory(Item item) {
        this.item = item;
    }

    public Strategy getStrategy() {
        throw new UnsupportedOperationException();
    }
}
