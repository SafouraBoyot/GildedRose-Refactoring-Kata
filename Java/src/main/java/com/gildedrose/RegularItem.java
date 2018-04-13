package com.gildedrose;

public class RegularItem extends Item implements ItemHandler {

    public RegularItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (qualityCanBeDecreased()) {
            this.quality--;
        }
    }

    private boolean qualityCanBeDecreased() {
        return this.quality > 0;
    }

    @Override
    public void updateSellIne() {
        this.sellIn--;
    }
}
