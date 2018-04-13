package main;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumbersTest {

    @Test
    public void testNumberOfComponentsFavorableCase() {

        Numbers numbers = new Numbers();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(245);
        list.add(22);
        list.add(67);
        list.add(34);
        list.add(29);
        list.add(345);
        list.add(8);
        list.add(354);
        list.add(11);
        list.add(7);
        list.add(34);
        list.add(12);
        list.add(45);
        list.add(39);
        list.add(41);
        list.add(26);
        list.add(67);
        list.add(89);
        list.add(1011);

        int expectedResult = 15;
        int receivedResult = numbers.findNumberOfComponents(list);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void testNumberOfComponentsUnFavorableCase() {

        Numbers numbers = new Numbers();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(22);

        int expectedResult = 1;
        int receivedResult = numbers.findNumberOfComponents(list);

        assertEquals(expectedResult, receivedResult);
    }
}
