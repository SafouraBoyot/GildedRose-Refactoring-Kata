package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {

            boolean isSulfuras = ItemName.isSulfuras(items[i].name);
            boolean isAgedBrie = ItemName.isAgedBrie(items[i].name);
            boolean isBackstagePasses = ItemName.isBackstagePasses(items[i].name);

            if (!isAgedBrie && !isBackstagePasses) {
                if (items[i].quality > 0) {
                    decreaseQuality(i, isSulfuras);
                }
            } else {
                if (items[i].quality < 50) {
                    increaseQuality(i);
                    if (ItemName.isBackstagePasses(items[i].name)) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                increaseQuality(i);
                            }
                        }
                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                increaseQuality(i);
                            }
                        }
                    }
                }
            }

            checkSellIn(i, isSulfuras);
            if (items[i].sellIn < 0) {
                if (!isAgedBrie) {
                    if (!isBackstagePasses) {
                        if (items[i].quality > 0) {
                            decreaseQuality(i, isSulfuras);
                        }
                    } else {
                        items[i].quality = 0;
                    }
                } else {
                    if (items[i].quality < 50) {
                        increaseQuality(i);
                    }
                }
            }
        }
    }

    private void checkSellIn(int i, boolean isSulfuras) {
        if (!isSulfuras) {
            decreaseSellIn(i);
        }
    }



    private void decreaseSellIn(int index) {
        items[index].sellIn = items[index].sellIn - 1;
    }

    private void increaseQuality(int index) {
        items[index].quality = items[index].quality + 1;
    }

    private void decreaseQuality(int index, boolean isSulfuras) {
        if (!isSulfuras) {
            items[index].quality = items[index].quality - 1;
        }
    }
}