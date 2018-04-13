package com.gildedrose;

public class AgedBrieCategory extends Category implements CategoryHandler {
    public AgedBrieCategory(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public Item update() {
        updateQuality();
        updateSellIn();
        return this;
    }

    private void updateQuality() {
        if (this.sellIn < 0) {
            increaseQuality();
        }
        increaseQuality();
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
