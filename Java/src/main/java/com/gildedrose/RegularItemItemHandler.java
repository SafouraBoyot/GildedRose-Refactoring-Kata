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
            item.quality--;
        }
    }

    private boolean qualityCanBeDecreased() {
        return item.quality > 0;
    }

    private void updateSellIn() {
        item.sellIn--;
    }
}
