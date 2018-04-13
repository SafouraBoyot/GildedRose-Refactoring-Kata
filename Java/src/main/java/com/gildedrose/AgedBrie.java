package com.gildedrose;

public class AgedBrie extends Item implements ItemHandler {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }


    @Override
    public void updateQuality() {
        if (this.sellIn < 0) {
            this.quality++;
        }
        this.quality++;
    }

    @Override
    public void updateSellIne() {
        this.sellIn--;
    }
}
