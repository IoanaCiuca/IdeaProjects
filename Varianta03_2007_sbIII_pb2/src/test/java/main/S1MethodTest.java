package main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class S1MethodTest {

    @Test
    public void testReturnedNumberOfDigits() {

        S1Method number = new S1Method();

        int numberToCheck = 1234;

        int expectedResult = 4;
        int receivedResult = number.s1(numberToCheck);

        assertEquals(expectedResult, receivedResult);
    }

}
