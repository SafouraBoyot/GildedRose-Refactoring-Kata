package com.gildedrose.acceptance;
import com.gildedrose.TexttestFixture;
import org.junit.Test;
import java.io.*;
import static org.junit.Assert.assertEquals;

public class GlidedRoseFeature {
    @Test
    public void GoldMaster() {        
        String actualResult = getActualResult();
        String expectedResult = getExpectedResult();
        
        assertEquals(actualResult, expectedResult);
    }

    private String getExpectedResult() {
        String FILENAME = "src/test/java/com/gildedrose/goldenMaster.txt";
        BufferedReader br = null;
        FileReader fr = null;
        StringBuilder expectedResult = new StringBuilder();
        try {
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                expectedResult.append(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return expectedResult.toString();
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
        return consoleResult.replaceAll("\n", "");
    }
}
