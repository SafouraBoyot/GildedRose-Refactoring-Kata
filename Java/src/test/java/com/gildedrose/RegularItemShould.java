package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularItemShould {
    @Test
    public void decrease_in_quality()
    {
        Item item = new Item("Elixir of the Mongoose", 2, 4);
        RegularItem regularItem = new RegularItem(item);
        int expectedQuality = regularItem.quality-1;

        regularItem.updateQuality();

        assertEquals(expectedQuality, regularItem.quality);
    }

    @Test
    public void decrease_in_sellIn() {
        Item item = new Item("Elixir of the Mongoose", 2, 4);
        RegularItem regularItem = new RegularItem(item);
        int expectedSellIn = regularItem.sellIn-1;

        regularItem.updateSellIn();

        assertEquals(expectedSellIn, regularItem.sellIn);
    }

}
