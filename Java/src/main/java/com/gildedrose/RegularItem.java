package com.gildedrose;

public class RegularItem extends Item implements Strategy {

    private Item item;

    public RegularItem(Item item) {
        super(item.name, item.sellIn, item.quality);
        this.item = item;
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
