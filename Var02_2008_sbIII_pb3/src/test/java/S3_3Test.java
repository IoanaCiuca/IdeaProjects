import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class S3_3Test {

    @Test
    public void sortPositiveNumbers() {
        S3_3 s3_3 = new S3_3();
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(-3);
        inputList.add(-10);
        inputList.add(0);
        inputList.add(7);
        inputList.add(-5);
        inputList.add(7);
        inputList.add(51);
        inputList.add(-800);
        inputList.add(6);
        inputList.add(3798);

        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("6");
        expectedResult.add("7");
        expectedResult.add("7");
        expectedResult.add("51");
        expectedResult.add("3798");

        ArrayList<String> receivedResult = s3_3.sortPositiveNumbers(inputList);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void sortPositiveNumbersNegativeCase() {
        S3_3 s3_3 = new S3_3();
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(-3);
        inputList.add(-10);
        inputList.add(0);
        inputList.add(-7);
        inputList.add(-5);
        inputList.add(-7);
        inputList.add(-51);
        inputList.add(-800);
        inputList.add(-6);
        inputList.add(-3798);

        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Nu exista");

        ArrayList<String> receivedResult = s3_3.sortPositiveNumbers(inputList);

        assertEquals(expectedResult, receivedResult);
    }
}