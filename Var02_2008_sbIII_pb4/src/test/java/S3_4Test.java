import org.junit.Test;

import static org.junit.Assert.*;

public class S3_4Test {

    private S3_4 s3_4 = new S3_4();

    @Test
    public void f() {
        int inputNumber = 90;
        int expectedResult = 4;
        int receivedResult = s3_4.f(inputNumber);

        assertEquals(expectedResult,receivedResult);
    }

    @Test
    public void fPrimeNumber() {
        int inputNumber = 113;
        int expectedResult = 1;
        int receivedResult = s3_4.f(inputNumber);

        assertEquals(expectedResult,receivedResult);
    }

    @Test
    public void extraprimFavorableCase() {
        int n = 113;
        String expectedResult = "Da";
        String receivedResult = s3_4.extraprim(n);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void extraprimUnFavorableCase() {
        int n = 251;
        String expectedResult = "Nu";
        String receivedResult = s3_4.extraprim(n);

        assertEquals(expectedResult, receivedResult);
    }
}