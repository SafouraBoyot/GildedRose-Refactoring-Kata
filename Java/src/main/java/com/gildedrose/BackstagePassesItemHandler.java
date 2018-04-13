package com.gildedrose;

public class BackstagePassesItemHandler extends Item implements ItemHandler {
    private Item item;

    public BackstagePassesItemHandler(Item item) {
        super(item.name, item.sellIn, item.quality);
        this.item = item;
    }

    @Override
    public Item updateQuality() {
        if (this.sellIn < 0) this.quality = 0;
        increaseQuality();
        if (sellIn < 11) {
            increaseQuality();
        }
        if (sellIn < 6) {
            increaseQuality();
        }
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