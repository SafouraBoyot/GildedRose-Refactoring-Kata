package com.gildedrose;

public class AgedBrie extends Item implements Strategy {

    private Item item;

    public AgedBrie(Item item) {
        super(item.name, item.sellIn, item.quality);
        this.item = item;
    }

    @Override
    public Item updateQuality() {
        if (this.sellIn < 0) {
            increaseQuality();
        }
        increaseQuality();
        return this;
    }

    @Override
    public Item updateSellIn() {
        this.sellIn--;
        return this;
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
