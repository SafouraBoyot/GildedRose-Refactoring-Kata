package com.gildedrose;

public class BackstagePasses extends Item implements ItemHandler {
    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void decreaseQuality() {

    }

    @Override
    public void increaseQuality() {
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
    public void decreaseSellIn() {

    }

    @Override
    public void increaseSellIn() {

    }

    private boolean qualityCanBeIncreased() {
        return this.quality < 50;
    }

}
