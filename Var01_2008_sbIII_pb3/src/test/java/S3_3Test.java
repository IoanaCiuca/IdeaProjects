import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class S3_3Test {

    @Test
    public void findDivisibleNumbersTest() {
        S3_3 s3_3 = new S3_3();

        int n = 10;
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(3);
        inputList.add(100);
        inputList.add(40);
        inputList.add(70);
        inputList.add(25);
        inputList.add(5);
        inputList.add(80);
        inputList.add(6);
        inputList.add(3798);

        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("100");
        expectedResult.add("40");
        expectedResult.add("70");
        expectedResult.add("80");

        ArrayList<String> receivedResult = s3_3.findDivisibleNumbers(n, inputList);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void findDivisibleNumbersCase1Test() {
        S3_3 s3_3 = new S3_3();

        int n = 10;
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(3);
        inputList.add(25);
        inputList.add(5);
        inputList.add(6);
        inputList.add(3798);

        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Nu exista");

        ArrayList<String> receivedResult = s3_3.findDivisibleNumbers(n, inputList);

        assertEquals(expectedResult, receivedResult);
    }
}
