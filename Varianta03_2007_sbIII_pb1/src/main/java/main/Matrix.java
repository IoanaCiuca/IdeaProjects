package main;

import java.util.ArrayList;

public class Matrix {

    public ArrayList<ArrayList<Integer>> createMatrix (int dimension) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for(int i=0; i<dimension; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<dimension; j++) {
                if (i == j || i + j == dimension - 1 || (i < j && i + j < dimension - 1) || (i > j && i + j > dimension - 1))
                    row.add(1);
                else
                    row.add(2);
            }
            matrix.add(row);
        }
        return matrix;
    }
}
