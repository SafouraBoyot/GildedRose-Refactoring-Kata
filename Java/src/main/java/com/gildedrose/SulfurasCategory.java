package com.gildedrose;

public class SulfurasCategory extends Category implements CategoryHandler {
    public SulfurasCategory(Item item) {
        super(item.name, item.sellIn, item.quality);
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
