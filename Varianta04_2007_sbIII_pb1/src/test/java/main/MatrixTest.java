package main;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MatrixTest {

    @Test
    public void testCreatedMatrix() {

        Matrix matrix = new Matrix();
        int dimension = 5;
        ArrayList<ArrayList<Integer>> expectedMatrix = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        ArrayList<Integer> row2 = new ArrayList<>();
        ArrayList<Integer> row3 = new ArrayList<>();
        ArrayList<Integer> row4 = new ArrayList<>();
        ArrayList<Integer> row5 = new ArrayList<>();

        row1.add(3);
        row1.add(3);
        row1.add(1);
        row1.add(3);
        row1.add(3);

        row2.add(3);
        row2.add(3);
        row2.add(1);
        row2.add(3);
        row2.add(3);

        row3.add(1);
        row3.add(1);
        row3.add(2);
        row3.add(1);
        row3.add(1);

        row4.add(3);
        row4.add(3);
        row4.add(1);
        row4.add(3);
        row4.add(3);

        row5.add(3);
        row5.add(3);
        row5.add(1);
        row5.add(3);
        row5.add(3);

        expectedMatrix.add(row1);
        expectedMatrix.add(row2);
        expectedMatrix.add(row3);
        expectedMatrix.add(row4);
        expectedMatrix.add(row5);

        ArrayList<ArrayList<Integer>> receivedMatrix = matrix.createMatrix(dimension);
        assertEquals(expectedMatrix, receivedMatrix);
    }
}
