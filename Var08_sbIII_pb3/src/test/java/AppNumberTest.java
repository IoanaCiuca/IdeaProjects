import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class AppNumberTest {

    @Test
    public void convertStringToIntFavorableCaseSingleLineTest() {
       String givenList = "7 22 7 6";
       System.out.println(givenList);
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

    @Test
    public void convertStringToIntFavorableCaseMultipleLineTest() {
        String givenList = "7 22 7 6" + System.lineSeparator() + "739 212 7 6";
        AppNumber appNumber = new AppNumber();
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(7);
        expectedResult.add(22);
        expectedResult.add(7);
        expectedResult.add(6);

        expectedResult.add(739);
        expectedResult.add(212);
        expectedResult.add(7);
        expectedResult.add(6);

        ArrayList<Integer> receivedResult = appNumber.convertStringToInt(givenList);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void countElementsTest() {
        ArrayList<Integer> inputList = new ArrayList<>();

        inputList.add(7);
        inputList.add(22);
        inputList.add(7);
        inputList.add(6);
        inputList.add(10);
        inputList.add(10);
        inputList.add(6);
        inputList.add(22);
        inputList.add(6);
        inputList.add(10);
        inputList.add(22);
        inputList.add(10);

        AppNumber appNumber = new AppNumber();
        HashMap<Integer, Integer> expectedResult = new HashMap<>();
        expectedResult.put(6,3);
        expectedResult.put(7,2);
        expectedResult.put(10,4);
        expectedResult.put(22,3);

        HashMap<Integer, Integer> receivedResult = appNumber.countElements(inputList);

        assertEquals(expectedResult, receivedResult);
    }

}