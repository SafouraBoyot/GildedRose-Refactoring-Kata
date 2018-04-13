package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularItemShould {
    @Test
    public void decrease_in_quality()
    {
        RegularItem regularItem = new RegularItem("Elixir of the Mongoose", 2, 4);
        int expectedQuality = regularItem.quality-1;

        regularItem.updateQuality();

        assertEquals(expectedQuality, regularItem.quality);
    }

    @Test
    public void decrease_in_sellIn() {
        RegularItem regularItem = new RegularItem("Elixir of the Mongoose", 2, 4);
        int expectedSellIn = regularItem.sellIn-1;

        regularItem.updateSellIne();

        assertEquals(expectedSellIn, regularItem.sellIn);
    }

}
