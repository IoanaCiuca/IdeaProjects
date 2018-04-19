import org.junit.Test;

import static org.junit.Assert.*;

public class SubMethodTest {
    @Test
    public void testSubMethodDigitExists() {
        int numberToCheck = 152422;
        int digit = 2;
        int expectedResult = 15422;
        SubMethod subMethod = new SubMethod();
        int receivedResult = subMethod.sub(numberToCheck, digit);

        assertEquals(expectedResult,receivedResult);
    }


    @Test
    public void testSubMethodDigitDoesntExist() {
        int numberToCheck = 1892;
        int digit = 5;
        int expectedResult = 1892;
        SubMethod subMethod = new SubMethod();
        int receivedResult = subMethod.sub(numberToCheck, digit);

        assertEquals(expectedResult,receivedResult);
    }

    @Test
    public void testTestReverseNumber() {
        int numberToCheck = 152422;
        int expectedResult = 224251;
        SubMethod subMethod = new SubMethod();
        int receivedResult= subMethod.reverseNumber(numberToCheck);

        assertEquals(expectedResult, receivedResult);
    }
}