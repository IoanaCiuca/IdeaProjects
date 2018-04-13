package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  {

        String fileName = "bac.txt";
        String line = null;
        ArrayList<Integer> list = new ArrayList<>();
        Numbers numbers = new Numbers();

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }

            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println( "Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
        
        System.out.println("Numerele citite sunt:");
        for (int elem: list) {
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println("Rezultatul este: ");
        int result = numbers.findNumberOfComponents(list);
        System.out.println(result);
    }
}
