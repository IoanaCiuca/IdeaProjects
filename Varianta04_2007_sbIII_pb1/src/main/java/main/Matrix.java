package main;

import java.util.ArrayList;

public class Matrix {

    public ArrayList<ArrayList<Integer>> createMatrix (int dimension) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for(int i=0; i<dimension; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<dimension; j++) {
                if(i == dimension/2 && j == dimension/2)
                    row.add(2);
                else if(i == dimension/2 || j == dimension/2)
                    row.add(1);
                else
                    row.add(3);

            }
            matrix.add(row);
        }
        return matrix;
    }
}
