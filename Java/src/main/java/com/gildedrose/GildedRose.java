package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            boolean isSulfuras = ItemName.isSulfuras(item.name);
            boolean isAgedBrie = ItemName.isAgedBrie(item.name);
            boolean isBackstagePasses = ItemName.isBackstagePasses(item.name);
            BackstagePasses backstagePasses = null;
            AgedBrie agedBrie = null;
            RegularItem regularItem = null;

            if (isBackstagePasses) {
                backstagePasses = new BackstagePasses(item.name, item.sellIn, item.quality);
                backstagePasses.updateQuality();
                backstagePasses.updateSellIne();
                item.quality = backstagePasses.quality;
                item.sellIn = backstagePasses.sellIn;

            }
            if (isAgedBrie) {
                agedBrie = new AgedBrie(item.name, item.sellIn, item.quality);
                agedBrie.updateQuality();
                agedBrie.updateSellIne();
                item.quality = agedBrie.quality;
                item.sellIn = agedBrie.sellIn;
            }
            if (!isAgedBrie && !isBackstagePasses && !isSulfuras) {
                regularItem = new RegularItem(item.name, item.sellIn, item.quality);
                regularItem.updateQuality();
                regularItem.updateSellIne();
                item.quality = regularItem.quality;
                item.sellIn = regularItem.sellIn;

            }
        }
    }
}