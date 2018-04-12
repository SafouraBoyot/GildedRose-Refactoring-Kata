package com.gildedrose;

public enum  ItemName {
    AGED_BRIE("Aged Brie"), BACKSTAGE_PASSES("Backstage passes to a TAFKAL80ETC concert"), SULFURAS("Sulfuras, Hand of Ragnaros");

    private String name;

    ItemName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
