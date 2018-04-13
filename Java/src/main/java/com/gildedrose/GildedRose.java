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
            Sulfuras sulfuras = null;
            RegularItem regularItem = null;

            if (isBackstagePasses) {
                backstagePasses = new BackstagePasses(item.name, item.sellIn, item.quality);
                backstagePasses.updateQuality();
                backstagePasses.updateSellIne();
                item = backstagePasses;
            }
            if (isAgedBrie) {
                agedBrie = new AgedBrie(item.name, item.sellIn, item.quality);
                agedBrie.updateQuality();
                agedBrie.updateSellIne();
//                item = agedBrie;
            }
            if (isSulfuras) {
                sulfuras = new Sulfuras(item.name, item.sellIn, item.quality);
                sulfuras.updateQuality();
                sulfuras.updateSellIne();
//                item = sulfuras;
            } else {
                regularItem = new RegularItem(item.name, item.sellIn, item.quality);
                regularItem.updateQuality();
                regularItem.updateSellIne();
//                item = regularItem;
            }


            updateSellIn(item, isSulfuras, isBackstagePasses);


            if (!isAgedBrie && !isBackstagePasses) {
                decreaseQuality(item, isSulfuras);
            } else {
                if (qualityCanBeIncreased(item)) {
                    
                    if (!isBackstagePasses) {
                        increaseQuality(item);
//                        backstagePasses.updateQuality();
//                        item = backstagePasses;
                    }
                }
            }
            if (item.sellIn < 0) {
                if (isAgedBrie) {
                    increaseQuality(item);
                }
                if (!isAgedBrie) {
                    if (isBackstagePasses) {
                        item.quality = 0;
                    }
                    decreaseQuality(item, isSulfuras);
                }
            }
        }
    }

    private boolean qualityCanBeIncreased(Item item) {
        return item.quality < 50;
    }

    private void updateSellIn(Item item, boolean isSulfuras, boolean isBackstagePasses) {
        if (!isSulfuras && !isBackstagePasses) {
            decreaseSellIn(item);
        }
    }

    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void increaseQuality(Item item) {
        if (qualityCanBeIncreased(item)) {
            item.quality = item.quality + 1;
        }
    }

    private void decreaseQuality(Item item, boolean isSulfuras) {
        if (!isSulfuras && item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}