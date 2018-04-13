package com.gildedrose;

public class SulfurasCategory extends Category implements CategoryHandler {
    public SulfurasCategory(Item item) {
        super(item.name, item.sellIn, item.quality);
    }
    @Override
    public Item update() {
        return this;
    }
    

}
