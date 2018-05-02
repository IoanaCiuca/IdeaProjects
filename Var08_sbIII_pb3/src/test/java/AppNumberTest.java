import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppNumberTest {

    @Test
    public void convertStringToIntFavorableCaseTest() {
       String givenList = "7 22 7 6";
       AppNumber appNumber = new AppNumber();
       ArrayList<Integer> expectedResult = new ArrayList<>();
       expectedResult.add(7);
       expectedResult.add(22);
       expectedResult.add(7);
       expectedResult.add(6);

       ArrayList<Integer> receivedResult = appNumber.convertStringToInt(givenList);

       assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void convertStringToIntUnFavorableCaseTest() {
        String givenList = "7 2 7 6";
        AppNumber appNumber = new AppNumber();
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(7);
        expectedResult.add(2);
        expectedResult.add(7);
        expectedResult.add(6);

        ArrayList<Integer> receivedResult = appNumber.convertStringToInt(givenList);

        assertEquals(expectedResult, receivedResult);
    }

}