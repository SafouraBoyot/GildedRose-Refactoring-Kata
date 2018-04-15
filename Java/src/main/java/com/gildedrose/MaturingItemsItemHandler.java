package com.gildedrose;

public class MaturingItemsItemHandler implements ItemHandler {
    private Item item;

    public MaturingItemsItemHandler(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        updateQuality();
        updateSellIn();
    }

    private void updateQuality() {
        if (item.sellIn < 0) {
            increaseQuality();
        }
        increaseQuality();
    }


    private void updateSellIn() {
        item.sellIn--;
    }

    private void increaseQuality() {
        if (qualityCanBeIncreased()) {
            item.quality++;
        }
    }

    private boolean qualityCanBeIncreased() {
        return item.quality < 50;
    }
}
