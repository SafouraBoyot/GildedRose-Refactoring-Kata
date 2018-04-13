package com.gildedrose;


class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            CategoryFactory categoryFactory = new CategoryFactory(item);
            CategoryHandler categoryHandler = categoryFactory.getCategoryHandler();

            item.quality = categoryHandler.updateQuality().quality;
            item.sellIn = categoryHandler.updateSellIn().sellIn;
        }
    }
}