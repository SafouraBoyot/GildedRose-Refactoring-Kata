package com.gildedrose;

public class RegularItemItemHandler implements ItemHandler {
    private Item item;

    public RegularItemItemHandler(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
       updateQuality();
       updateSellIn();
    }
    
    private void updateQuality() {
        if (qualityCanBeDecreased()) {
            this.item.quality--;
        }
    }

    private boolean qualityCanBeDecreased() {
        return this.item.quality > 0;
    }

    private void updateSellIn() {
        this.item.sellIn--;
    }
}
