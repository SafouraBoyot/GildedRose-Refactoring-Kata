package com.gildedrose;


class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            StrategyFactory strategyFactory = new StrategyFactory(item);
            Strategy itemStrategy = strategyFactory.getStrategy();
            item.quality = itemStrategy.updateQuality().quality;
            item.sellIn = itemStrategy.updateSellIn().sellIn;


        }
    }
}