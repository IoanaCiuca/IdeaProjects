import java.util.ArrayList;

public class Matrix {
    public int[][] createMatrix(int dimension) {
        int[][] matrix = new int[dimension][dimension];

        for(int i=0; i<dimension; i++) {
            for(int j=0; j<dimension; j++) {
                if(i+j <= dimension-1)
                    matrix[i][j] = i+j+1;
                else
                    matrix[i][j] = 2*dimension-i-j-1;
            }
        }
        return matrix;
    }
}