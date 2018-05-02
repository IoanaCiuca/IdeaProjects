import org.junit.Test;

import static org.junit.Assert.*;

public class DifferentDigitsTest {

    @Test
    public void verifyNumbersFavorableCaseTest() {
        int firstNumber = 1237248;
        int secondNumber = 1245823;
        int expectedResult = 5;
        DifferentDigits differentDigits = new DifferentDigits();
        int receivedResult = differentDigits.verifyNumbers(firstNumber, secondNumber);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void verifyNumbersUnFavorableCaseTest() {
        int firstNumber = 1234;
        int secondNumber = 5678;
        int expectedResult = 0;
        DifferentDigits differentDigits = new DifferentDigits();
        int receivedResult = differentDigits.verifyNumbers(firstNumber, secondNumber);

        assertEquals(expectedResult, receivedResult);
    }

}