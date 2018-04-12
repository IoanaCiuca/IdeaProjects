package main;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        System.out.println("n= ");
        int number = input.nextInt();
        System.out.println("a= ");
        int digit1 = input.nextInt();
        System.out.println("b= ");
        int digit2 = input.nextInt();

        Number result = new Number();
        int resultedNumberOfDigits = result.returnNumberOfDifferentDigits(number, digit1, digit2);

        System.out.println(resultedNumberOfDigits);
    }
}
