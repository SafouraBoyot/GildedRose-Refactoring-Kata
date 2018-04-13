package com.gildedrose;

public class AgedBrie extends Item implements ItemHandler {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    
    @Override
    public void updateQuality() {
        if (this.sellIn < 0) {
            increaseQuality();
        }
        increaseQuality();
    }

    private void increaseQuality() {
        if (qualityCanBeIncreased()) {
            this.quality++;
        }
    }

    private boolean qualityCanBeIncreased() {
        return this.quality < 50;
    }

    @Override
    public void updateSellIne() {
        this.sellIn--;
    }
}
