import java.util.ArrayList;

public class S3_1 {

    public ArrayList<ArrayList<Integer>> createMatrix(int n) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for(int i=0; i<n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<n; j++)
                if(i%2==0)
                    row.add(i*n+(j+1));
                else
                    row.add((i+1)*n-j);
            matrix.add(row);
        }
        return matrix;
    }
}
