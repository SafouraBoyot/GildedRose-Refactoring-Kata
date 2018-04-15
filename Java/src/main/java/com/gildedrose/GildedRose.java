package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemHandlerFactory itemHandlerFactory = new ItemHandlerFactory(item);
            ItemHandler itemHandler = itemHandlerFactory.getItemHandler();
            
            itemHandler.update();
        }
    }
}