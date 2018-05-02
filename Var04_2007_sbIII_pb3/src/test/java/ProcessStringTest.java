import org.junit.Test;

import static org.junit.Assert.*;

public class ProcessStringTest {

    @Test
    public void processStringTest() {
        String givenString = "2+3-4+6+8-5=";
        String expectedResult = "2+3-4+6+8-5=10";

        ProcessString processString = new ProcessString();
        String receivedResult =  processString.findResult(givenString);

        assertEquals(expectedResult, receivedResult);
    }
}