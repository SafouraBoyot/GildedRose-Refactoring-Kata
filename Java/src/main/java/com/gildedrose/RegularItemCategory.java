package com.gildedrose;

public class RegularItemCategory extends Category implements CategoryHandler {
    public RegularItemCategory(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public Item updateQuality() {
        if (qualityCanBeDecreased()) {
            this.quality--;
        }
        return this;
    }

    private boolean qualityCanBeDecreased() {
        return this.quality > 0;
    }

    @Override
    public Item updateSellIn() {
        this.sellIn--;
        return this;
    }
}
