package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgedBrieShould {
    @Test
    public void increase_in_quality()
    {
        AgedBrie agedBrie = new AgedBrie("Aged Brie", 2, 4);
        int expectedQuality = agedBrie.quality+1;

        agedBrie.updateQuality();

        assertEquals(expectedQuality, agedBrie.quality);
    }

    @Test
    public void decrease_in_sellIn() {
        AgedBrie agedBrie = new AgedBrie("Aged Brie", 2, 4);
        int expectedSellIn = agedBrie.sellIn-1;

        agedBrie.updateSellIne();

        assertEquals(expectedSellIn, agedBrie.sellIn);
    }

    @Test
    public void increase_in_quality_twice_when_sellIn_negative() {
        AgedBrie agedBrie = new AgedBrie("Aged Brie", -1, 2);
        int expectedQuality = agedBrie.quality+2;

        agedBrie.updateQuality();

        assertEquals(expectedQuality, agedBrie.quality);
    }
}
