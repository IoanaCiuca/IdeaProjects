import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class S3_1Test {

    @Test
    public void createMatrix() {
        int n = 7;
        S3_1 matrix = new S3_1();
        int dimension = 5;
        ArrayList<ArrayList<Integer>> expectedMatrix = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        ArrayList<Integer> row2 = new ArrayList<>();
        ArrayList<Integer> row3 = new ArrayList<>();
        ArrayList<Integer> row4 = new ArrayList<>();
        ArrayList<Integer> row5 = new ArrayList<>();

        row1.add(1);
        row1.add(2);
        row1.add(3);
        row1.add(4);
        row1.add(5);

        row2.add(10);
        row2.add(9);
        row2.add(8);
        row2.add(7);
        row2.add(6);

        row3.add(11);
        row3.add(12);
        row3.add(13);
        row3.add(14);
        row3.add(15);

        row4.add(20);
        row4.add(19);
        row4.add(18);
        row4.add(17);
        row4.add(16);

        row5.add(21);
        row5.add(22);
        row5.add(23);
        row5.add(24);
        row5.add(25);

        expectedMatrix.add(row1);
        expectedMatrix.add(row2);
        expectedMatrix.add(row3);
        expectedMatrix.add(row4);
        expectedMatrix.add(row5);

        ArrayList<ArrayList<Integer>> receivedMatrix = matrix.createMatrix(dimension);
        assertEquals(expectedMatrix, receivedMatrix);

    }
}