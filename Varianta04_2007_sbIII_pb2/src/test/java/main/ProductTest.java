package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    @Test
    public void testPrimeNumberCase() {
        Product product = new Product();

        int numberToCheck = 13;
        int expectedResult = 13;
        int receivedResult = product.product(numberToCheck);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void testUnPrimeNumberCase() {
        Product product = new Product();

        int numberToCheck = 300;
        int expectedResult = 30;
        int receivedResult = product.product(numberToCheck);

        assertEquals(expectedResult, receivedResult);
    }
}
