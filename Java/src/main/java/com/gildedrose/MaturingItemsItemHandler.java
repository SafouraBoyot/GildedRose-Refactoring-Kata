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
        if (this.item.sellIn < 0) {
            increaseQuality();
        }
        increaseQuality();
    }


    private void updateSellIn() {
        this.item.sellIn--;
    }

    private void increaseQuality() {
        if (qualityCanBeIncreased()) {
            this.item.quality++;
        }
    }

    private boolean qualityCanBeIncreased() {
        return this.item.quality < 50;
    }
}
