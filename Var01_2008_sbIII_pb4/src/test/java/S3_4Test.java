import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class S3_4Test {

    @Test
    public void subTest() {
        S3_4 s3_4 = new S3_4();
        int a=20;
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(21);
        inputList.add(9);
        inputList.add(21);
        inputList.add(403);

        int expectedResult = 2;
        int receivedResult = s3_4.sub(inputList, a);

        assertEquals(expectedResult, receivedResult);
    }
}
