package com.gildedrose;

public class BackstagePassesCategory extends Category implements CategoryHandler {
    public BackstagePassesCategory(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public Item update() {
        updateQuality();
        updateSellIn();
        return this;
    }

    private void updateQuality() {
        if (this.sellIn < 0) this.quality = 0;
        increaseQuality();
        if (sellIn < 11) {
            increaseQuality();
        }
        if (sellIn < 6) {
            increaseQuality();
        }
    }

    private void updateSellIn() {
        this.sellIn--;
    }

    private void increaseQuality() {
        if (qualityCanBeIncreased()) {
            this.quality++;
        }
    }

    private boolean qualityCanBeIncreased() {
        return this.quality < 50;
    }

}
