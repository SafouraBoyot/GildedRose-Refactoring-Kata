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
            
            Item newItem = categoryHandler.update();
            
            item.quality = newItem.quality;
            item.sellIn = newItem.sellIn;
        }
    }
}