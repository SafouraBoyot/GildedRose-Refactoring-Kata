package com.gildedrose;

public class Sulfuras extends Item implements Strategy {

    private Item item;

    public Sulfuras(Item item) {
        super(item.name, item.sellIn, item.quality);
        this.item = item;
    }


    @Override
    public Item updateQuality() {
        return this;
    }

    @Override
    public Item updateSellIn() {
        return this;
    }
}
