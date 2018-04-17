package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SameFactorsTest {

    @Test
    public void testSameFactorsFavorableCase() {
        SameFactors factors = new SameFactors();

        int numberToCheck1 = 300;
        int numberToCheck2 = 1500;
        int numberToCheck3 = 30;
        String expectedResult = "Da";
        String receivedResult = factors.checkSameFactors(numberToCheck1, numberToCheck2, numberToCheck3);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void testSameFactorsUnFavorableCase() {
        SameFactors factors = new SameFactors();

        int numberToCheck1 = 300;
        int numberToCheck2 = 700;
        int numberToCheck3 = 140;
        String expectedResult = "Nu";
        String receivedResult = factors.checkSameFactors(numberToCheck1, numberToCheck2, numberToCheck3);

        assertEquals(expectedResult, receivedResult);
    }
}
