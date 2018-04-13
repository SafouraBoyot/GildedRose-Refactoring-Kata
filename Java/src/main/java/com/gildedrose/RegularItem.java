package com.gildedrose;

public class RegularItem extends Item implements ItemHandler {

    public RegularItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {

    }

    @Override
    public void updateSellIne() {

    }
}
