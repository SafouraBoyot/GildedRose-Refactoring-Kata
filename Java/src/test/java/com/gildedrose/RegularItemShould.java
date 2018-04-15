package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularItemShould {
    @Test
    public void decrease_in_quality()
    {
        Item item = new Item("Elixir of the Mongoose", 2, 4);
        RegularItemItemHandler regularItem = new RegularItemItemHandler(item);
        int expectedQuality = item.quality-1;

        regularItem.update();

        assertEquals(expectedQuality, item.quality);
    }

    @Test
    public void decrease_in_sellIn() {
        Item item = new Item("Elixir of the Mongoose", 2, 4);
        RegularItemItemHandler regularItem = new RegularItemItemHandler(item);
        int expectedSellIn = item.sellIn-1;

        regularItem.update();

        assertEquals(expectedSellIn, item.sellIn);
    }

}
