import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class S3_3Test {

    @Test
    public void testRidgeCase1() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(12);
        list.add(17);
        list.add(26);
        list.add(15);
        list.add(3);

        S3_3 s3_3 = new S3_3();
        int expectedResult = 26;
        int receivedResult = s3_3.ridge(list);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void testRidgeCase2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(12);
        list.add(17);
        list.add(10);
        list.add(15);
        list.add(3);

        S3_3 s3_3 = new S3_3();
        int expectedResult = 0;
        int receivedResult = s3_3.ridge(list);

        assertEquals(expectedResult, receivedResult);
    }
}