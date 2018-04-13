package com.gildedrose;

public class RegularItemCategory extends Category implements CategoryHandler {
    public RegularItemCategory(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public Item update() {
       updateQuality();
       updateSellIn();
        return this;
    }
    private void updateQuality() {
        if (qualityCanBeDecreased()) {
            this.quality--;
        }
    }

    private boolean qualityCanBeDecreased() {
        return this.quality > 0;
    }

    private void updateSellIn() {
        this.sellIn--;
    }

}
