package main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class S2MethodTest {

    @Test
    public void testReturnedNumberFavorableCase() {

        S2Method number = new S2Method();

        int numberToCheck = 1232;
        int digitToCheck = 2;

        int expectedResult = 122322;
        int receivedResult = number.s2(numberToCheck, digitToCheck);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void testReturnedNumberUnFavorableCase() {

        S2Method number = new S2Method();

        int numberToCheck = 1232;
        int digitToCheck = 4;

        int expectedResult = 1232;
        int receivedResult = number.s2(numberToCheck, digitToCheck);

        assertEquals(expectedResult, receivedResult);
    }
}
