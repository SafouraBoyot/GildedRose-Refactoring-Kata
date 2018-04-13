package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgedBrieShould {
    @Test
    public void increase_in_quality()
    {
        Item item = new Item("Aged Brie", 2, 4);

        AgedBrie agedBrie = new AgedBrie(item);
        int expectedQuality = agedBrie.quality+1;

        agedBrie.updateQuality();

        assertEquals(expectedQuality, agedBrie.quality);
    }

    @Test
    public void decrease_in_sellIn() {
        Item item = new Item("Aged Brie", 2, 4);

        AgedBrie agedBrie = new AgedBrie(item);
        int expectedSellIn = agedBrie.sellIn-1;

        agedBrie.updateSellIn();

        assertEquals(expectedSellIn, agedBrie.sellIn);
    }

    @Test
    public void increase_in_quality_twice_when_sellIn_negative() {


        Item item = new Item("Aged Brie", -1, 2);
        AgedBrie agedBrie = new AgedBrie(item);
        int expectedQuality = agedBrie.quality+2;

        agedBrie.updateQuality();

        assertEquals(expectedQuality, agedBrie.quality);
    }
}
