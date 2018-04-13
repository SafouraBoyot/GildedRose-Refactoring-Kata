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
            }
            if (isAgedBrie) {
                agedBrie = new AgedBrie(item.name, item.sellIn, item.quality);
            }
            if (isSulfuras) {
                sulfuras = new Sulfuras(item.name, item.sellIn, item.quality);
            } else {
                regularItem = new RegularItem(item.name, item.sellIn, item.quality);
            }


            updateSellIn(item, isSulfuras);


            if (!isAgedBrie && !isBackstagePasses) {
                decreaseQuality(item, isSulfuras);
            } else {
                if (qualityCanBeIncreased(item)) {
                    increaseQuality(item);
                    if (isBackstagePasses) {
                        backstagePasses.updateQuality();
                        item = backstagePasses;
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


    private void increaseQualityForBackstagePasses(Item item, boolean isBackstagePasses) {
        if (isBackstagePasses) {
            if (item.sellIn < 11) {
                increaseQuality(item);
            }
            if (item.sellIn < 6) {
                increaseQuality(item);
            }
        }
    }

    private boolean qualityCanBeIncreased(Item item) {
        return item.quality < 50;
    }

    private void updateSellIn(Item item, boolean isSulfuras) {
        if (!isSulfuras) {
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