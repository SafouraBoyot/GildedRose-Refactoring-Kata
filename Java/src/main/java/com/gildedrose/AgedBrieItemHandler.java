package com.gildedrose;

public class AgedBrieItemHandler extends Item implements ItemHandler {

    private Item item;

    public AgedBrieItemHandler(Item item) {
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
