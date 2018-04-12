package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberTest {

    @Test
    public void testReturnedNumberOfDigitsFirstParameterExistsCase() {

        Number number = new Number();

        int numberToCheck = 1323;
        int digitToCheck1 = 3;
        int digitToCheck2 = 4;

        int expectedResult = 2;
        int receivedResult = number.returnNumberOfDifferentDigits(numberToCheck, digitToCheck1, digitToCheck2);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void testReturnedNumberOfDigitsSecondParameterExistsCase() {

        Number number = new Number();

        int numberToCheck = 1215;
        int digitToCheck1 = 3;
        int digitToCheck2 = 2;

        int expectedResult = 3;
        int receivedResult = number.returnNumberOfDifferentDigits(numberToCheck, digitToCheck1, digitToCheck2);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void testReturnedNumberOfDigitsBothParametersExistCase1() {

        Number number = new Number();

        int numberToCheck = 1313;
        int digitToCheck1 = 3;
        int digitToCheck2 = 1;

        int expectedResult = 0;
        int receivedResult = number.returnNumberOfDifferentDigits(numberToCheck, digitToCheck1, digitToCheck2);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void testReturnedNumberOfDigitsBothParametersExistCase2() {

        Number number = new Number();

        int numberToCheck = 1312;
        int digitToCheck1 = 3;
        int digitToCheck2 = 1;

        int expectedResult = 1;
        int receivedResult = number.returnNumberOfDifferentDigits(numberToCheck, digitToCheck1, digitToCheck2);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void testReturnedNumberOfDigitsNeitherParametersExistCase() {

        Number number = new Number();

        int numberToCheck = 1325;
        int digitToCheck1 = 6;
        int digitToCheck2 = 4;

        int expectedResult = 4;
        int receivedResult = number.returnNumberOfDifferentDigits(numberToCheck, digitToCheck1, digitToCheck2);

        assertEquals(expectedResult, receivedResult);
    }
}
