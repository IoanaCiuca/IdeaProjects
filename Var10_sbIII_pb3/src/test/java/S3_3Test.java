import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class S3_3Test {

    @Test
    public void getMaxim() {
        S3_3 s3_3 = new S3_3();
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(5);
        inputList.add(11);
        inputList.add(7);
        inputList.add(3);
        inputList.add(8);
        inputList.add(-2);
        inputList.add(11);
        inputList.add(11);
        inputList.add(-7);
        inputList.add(5);

        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(11);
        expectedResult.add(8);

        ArrayList<Integer> receivedResult = s3_3.getMaxim(inputList);

        assertEquals(expectedResult, receivedResult);
    }
}
