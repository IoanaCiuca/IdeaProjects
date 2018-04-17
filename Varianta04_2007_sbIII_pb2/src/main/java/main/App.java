package main;

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
        System.out.println("Number one=");
        int number1 = input.nextInt();
        System.out.println("Number two=");
        int number2 = input.nextInt();
        System.out.println("Number three=");
        int number3 = input.nextInt();

        SameFactors factors = new SameFactors();

        String result = factors.checkSameFactors(number1, number2, number3);
        System.out.println(result);
    }
}
