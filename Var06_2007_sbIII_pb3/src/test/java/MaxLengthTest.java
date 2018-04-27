import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxLengthTest {

    @Test
    public void findMaxLengthTest() {
        int dimension = 10;
        int[] arrayToCheck = {7,22, -3, 10, 3, 14, 0, 21, 10, 8};
        int expectedResult = 3;
        MaxLength maxLength = new MaxLength();
        int receivedResult = maxLength.findMaxLength(dimension, arrayToCheck);
        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void findMaxLengthSingleElementTest() {
        int dimension = 1;
        int[] arrayToCheck = {22};
        int expectedResult = 1;
        MaxLength maxLength = new MaxLength();
        int receivedResult = maxLength.findMaxLength(dimension, arrayToCheck);
        assertEquals(expectedResult, receivedResult);
    }
}
