package com.gildedrose;

public class BackstagePasses extends Item implements ItemHandler {
    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.sellIn < 0) this.quality = 0;
        increaseQuality();
        if (sellIn < 11) {
            increaseQuality();
        }
        if (sellIn < 6) {
            increaseQuality();
        }
    }

    private void increaseQuality() {
        if (qualityCanBeIncreased()) {
            this.quality++;
        }
    }

    @Override
    public void updateSellIne() {
        this.sellIn--;
    }

    private boolean qualityCanBeIncreased() {
        return this.quality < 50;
    }
}
