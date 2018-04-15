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
        if (this.item.sellIn < 0) {
            this.item.quality = 0;
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
        return this.item.sellIn < 6;
    }

    private boolean lessThanElevenDaysToSellItem() {
        return this.item.sellIn < 11;
    }

    private void updateSellIn() {
        this.item.sellIn--;
    }

    private void increaseQuality() {
        if (qualityCanBeIncreased()) {
            this.item.quality++;
        }
    }

    private boolean qualityCanBeIncreased() {
        return this.item.quality < 50;
    }
}
