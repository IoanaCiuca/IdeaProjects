import org.junit.Test;

import static org.junit.Assert.*;

public class SumaZecClassTest {

    @Test
    public void sumazecTest() {
        int a = 4;
        int n = 3;
        int expectedResult = 7;
        SumaZecClass sumaZecClass = new SumaZecClass();
        int receivedResult = sumaZecClass.sumazec(a, n);

        assertEquals(expectedResult, receivedResult);
    }

}