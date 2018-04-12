package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item: items) { 
            boolean isSulfuras = ItemName.isSulfuras(item.name);
            boolean isAgedBrie = ItemName.isAgedBrie(item.name);
            boolean isBackstagePasses = ItemName.isBackstagePasses(item.name);

            checkSellIn(item, isSulfuras);

            if (isAgedBrie) {
                //do smth to its quality and sellin
            }
            if (isSulfuras) {
                //do smth to its quality and sellin
            }
            if (isBackstagePasses) {
                //do smth to its quality and sellin
            }
            
            if (!isAgedBrie && !isBackstagePasses) {
                decreaseQuality(item, isSulfuras);
            } else {
                if (item.quality < 50) {
                    increaseQuality(item);
                    if (isBackstagePasses) {
                        if (item.sellIn < 11) {
                            increaseQuality(item);
                        }
                        if (item.sellIn < 6) {
                            increaseQuality(item);
                        }
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

    private void checkSellIn(Item item, boolean isSulfuras) {
        if (!isSulfuras) {
            decreaseSellIn(item);
        }
    }
    
    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private void decreaseQuality(Item item, boolean isSulfuras) {
        if (!isSulfuras && item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}