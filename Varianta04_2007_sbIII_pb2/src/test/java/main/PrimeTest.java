package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeTest {

    @Test
    public void testIsPrimeNumber() {
        Prime number = new Prime();

        int numberToCheck = 197;
        boolean expectedResult = true;
        boolean receivedResult = number.isPrime(numberToCheck);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void testIsNotPrimeNumber() {
        Prime number = new Prime();

        int numberToCheck = 224;
        boolean expectedResult = false;
        boolean receivedResult = number.isPrime(numberToCheck);

        assertEquals(expectedResult, receivedResult);
    }
}
