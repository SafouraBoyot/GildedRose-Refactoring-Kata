package com.gildedrose;

public class BackstagePassesItemHandler implements ItemHandler {
    private Item item;

    public BackstagePassesItemHandler(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        updateQuality();
        updateSellIn();
    }

    private void updateQuality() {
        if (item.sellIn < 0) {
            item.quality = 0;
        }
        
        increaseQuality();
        
        if (lessThanElevenDaysToSellItem()) {
            increaseQuality();
        }
        if (lessThanSixDaysToSellItem()) {
            increaseQuality();
        }
    }

    private boolean lessThanSixDaysToSellItem() {
        return item.sellIn < 6;
    }

    private boolean lessThanElevenDaysToSellItem() {
        return item.sellIn < 11;
    }

    private void updateSellIn() {
        item.sellIn--;
    }

    private void increaseQuality() {
        if (qualityCanBeIncreased()) {
            item.quality++;
        }
    }

    private boolean qualityCanBeIncreased() {
        return item.quality < 50;
    }
}
