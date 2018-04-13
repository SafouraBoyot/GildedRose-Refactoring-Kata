package com.gildedrose;

public class SulfurasItemHandler extends Item implements ItemHandler {

    private Item item;

    public SulfurasItemHandler(Item item) {
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
