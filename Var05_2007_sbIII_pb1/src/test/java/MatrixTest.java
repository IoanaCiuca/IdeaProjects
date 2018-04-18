import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @org.junit.Test
    public void createMatrix() {

        Matrix matrix = new Matrix();
        int dimension=5;
        int expectedMatrix[][] = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 4}, {3, 4, 5, 4, 3}, {4, 5, 4, 3, 2}, {5, 4, 3, 2, 1}};
        int resultedMatrix[][] = matrix.createMatrix(dimension);

        assertArrayEquals(expectedMatrix, resultedMatrix);
    }

}