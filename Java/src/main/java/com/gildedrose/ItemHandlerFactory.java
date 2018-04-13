package com.gildedrose;

public class ItemHandlerFactory {
    private final Item item;

    public ItemHandlerFactory(Item item) {
        this.item = item;
    }

    public ItemHandler getItemHandler() {
        if (isBackstagePasses()) {
            return new BackstagePassesItemHandler(item);
        }
        if (isAgedBrie()) {
            return new AgedBrieItemHandler(item);
        }
        if (isSulfuras()) {
            return new SulfurasItemHandler(item);
        }
        return new RegularItemItemHandler(item);
    }

    private boolean isSulfuras() {
        return ItemName.isSulfuras(item.name);
    }

    private boolean isAgedBrie() {
        return ItemName.isAgedBrie(item.name);
    }

    private boolean isBackstagePasses() {
        return ItemName.isBackstagePasses(item.name);
    }
}

