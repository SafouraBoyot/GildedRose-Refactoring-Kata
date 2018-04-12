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

    public static boolean isAgedBrie(String name) {
        return AGED_BRIE.name.equals(name);
    }

    public static boolean isBackstagePasses(String name) {
        return BACKSTAGE_PASSES.name.equals(name);
    }

    public static boolean isSulfuras(String name) {
        return SULFURAS.name.equals(name);
    }
}
