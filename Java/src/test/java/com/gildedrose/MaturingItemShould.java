package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaturingItemShould {
    @Test
    public void increase_in_quality() {
        Item item = new Item("Aged Brie", 2, 4);

        MaturingItemsItemHandler agedBrie = new MaturingItemsItemHandler(item);
        int expectedQuality = item.quality+1;

        agedBrie.update();

        assertEquals(expectedQuality, item.quality);
    }

    @Test
    public void decrease_in_sellIn() {
        Item item = new Item("Aged Brie", 2, 4);

        MaturingItemsItemHandler agedBrie = new MaturingItemsItemHandler(item);
        int expectedSellIn = item.sellIn-1;

        agedBrie.update();

        assertEquals(expectedSellIn, item.sellIn);
    }

    @Test
    public void increase_in_quality_twice_when_sellIn_negative() {
        Item item = new Item("Aged Brie", -1, 2);
        MaturingItemsItemHandler agedBrie = new MaturingItemsItemHandler(item);
        int expectedQuality = item.quality+2;

        agedBrie.update();

        assertEquals(expectedQuality, item.quality);
    }
}
