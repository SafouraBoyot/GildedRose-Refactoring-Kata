package com.gildedrose;

public class AgedBrie extends Item implements ItemHandler {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void decreaseQuality() {

    }

    @Override
    public void increaseQuality() {

    }

    @Override
    public void decreaseSellIn() {

    }

    @Override
    public void increaseSellIn() {

    }
}
