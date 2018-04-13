package com.gildedrose;

public class StrategyFactory {
    private final Item item;

    public StrategyFactory(Item item) {
        this.item = item;
    }

    public Strategy getStrategy() {
        boolean isSulfuras = ItemName.isSulfuras(item.name);
        boolean isAgedBrie = ItemName.isAgedBrie(item.name);
        boolean isBackstagePasses = ItemName.isBackstagePasses(item.name);
        BackstagePasses backstagePasses = null;
        AgedBrie agedBrie = null;
        RegularItem regularItem = null;

        if (isBackstagePasses) {
            backstagePasses = new BackstagePasses(item);
            return backstagePasses;

        }
        if (isAgedBrie) {
            agedBrie = new AgedBrie(item);
            return agedBrie;

        }
        if (!isAgedBrie && !isBackstagePasses && !isSulfuras) {
            regularItem = new RegularItem(item);
            return regularItem;

        }
        return new Sulfuras(item);

}
}

