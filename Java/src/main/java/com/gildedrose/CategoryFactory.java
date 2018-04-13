package com.gildedrose;

public class CategoryFactory {
    private final Item item;

    public CategoryFactory(Item item) {
        this.item = item;
    }

    public CategoryHandler getCategoryHandler() {
        if (isBackstagePasses()) {
            return new BackstagePassesCategory(item);
        }
        if (isAgedBrie()) {
            return new AgedBrieCategory(item);
        }
        if (isSulfuras()) {
            return new SulfurasCategory(item);
        }
        return new RegularItemCategory(item);
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

