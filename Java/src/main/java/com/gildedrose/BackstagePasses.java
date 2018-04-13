package com.gildedrose;

public class BackstagePasses extends Item implements ItemHandler {
    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }


    private boolean qualityCanBeIncreased() {
        return this.quality < 50;
    }

    @Override
    public void updateQuality() {
        if (sellIn < 11) {
            if (qualityCanBeIncreased()) {
                this.quality ++;
            }
        }
        if (sellIn < 6) {
            if (qualityCanBeIncreased()) {
                this.quality ++;
            }
        }

    }

    @Override
    public void updateSellIne() {

    }
}
