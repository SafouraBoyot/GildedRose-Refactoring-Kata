package com.gildedrose.acceptance;
import com.gildedrose.TexttestFixture;
import org.junit.Test;
import java.io.*;
import static org.junit.Assert.assertEquals;

public class GlidedRoseFeature {
    @Test
    public void GoldenMaster() {        
        String actualResult = getActualResult();
        String expectedResult = getExpectedResult();
        
        assertEquals(actualResult, expectedResult);
    }

    private String getExpectedResult() {
        return "OMGHAI!\n" +
                "-------- day 0 --------\n" +
                "name, sellIn, quality\n" +
                "+5 Dexterity Vest, 10, 20\n" +
                "Aged Brie, 2, 0\n" +
                "Elixir of the Mongoose, 5, 7\n" +
                "Sulfuras, Hand of Ragnaros, 0, 80\n" +
                "Sulfuras, Hand of Ragnaros, -1, 80\n" +
                "Backstage passes to a TAFKAL80ETC concert, 15, 20\n" +
                "Backstage passes to a TAFKAL80ETC concert, 10, 49\n" +
                "Backstage passes to a TAFKAL80ETC concert, 5, 49\n" +
                "Conjured Mana Cake, 3, 6\n" +
                "\n" +
                "-------- day 1 --------\n" +
                "name, sellIn, quality\n" +
                "+5 Dexterity Vest, 9, 19\n" +
                "Aged Brie, 1, 1\n" +
                "Elixir of the Mongoose, 4, 6\n" +
                "Sulfuras, Hand of Ragnaros, 0, 80\n" +
                "Sulfuras, Hand of Ragnaros, -1, 80\n" +
                "Backstage passes to a TAFKAL80ETC concert, 14, 21\n" +
                "Backstage passes to a TAFKAL80ETC concert, 9, 50\n" +
                "Backstage passes to a TAFKAL80ETC concert, 4, 50\n" +
                "Conjured Mana Cake, 2, 5\n" +
                "\n";
    }

    private String getActualResult() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outputStream);
        PrintStream old = System.out;
        System.setOut(ps);
        TexttestFixture.main(new String[]{});
        System.out.flush();
        System.setOut(old);
        String consoleResult = outputStream.toString();
        
        return consoleResult;
    }
}
