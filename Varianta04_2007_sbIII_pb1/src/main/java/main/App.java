package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Dimension = ");
        int dimension = input.nextInt();

        Matrix matrix = new Matrix();
        ArrayList<ArrayList<Integer>> resultedMatrix = new ArrayList<>();
        resultedMatrix = matrix.createMatrix(dimension);

        System.out.println(resultedMatrix);
    }
}
