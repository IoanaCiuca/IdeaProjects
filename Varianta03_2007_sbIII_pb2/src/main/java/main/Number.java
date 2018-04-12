package main;

public class Number {

    public int returnNumberOfDifferentDigits(int number, int digit1, int digit2) {
        int resultedNumberOfDigits = 0;
        S1Method s1Method = new S1Method();
        S2Method s2Method = new S2Method();
        int numberOfDigits = s1Method.s1(number);
        int numberWithDigit1 = s2Method.s2(number, digit1);
        int numberOfDigitsWithDigit1 = s1Method.s1(numberWithDigit1);
        int numberWithDigit2 = s2Method.s2(number, digit2);
        int numberOfDigitsWithDigit2 = s1Method.s1(numberWithDigit2);

        //daca se repeta ambele cifre
        if(numberWithDigit1 != number && numberOfDigitsWithDigit2 != number) {
            //din numarul cu cifre mai multe scad numarul initial de cifre
            if(numberOfDigitsWithDigit1 > numberOfDigitsWithDigit2) {
                resultedNumberOfDigits = numberOfDigitsWithDigit1 - numberOfDigitsWithDigit2;
            } else {
                resultedNumberOfDigits = numberOfDigitsWithDigit2 - numberOfDigitsWithDigit1;
            }
        } else {
            resultedNumberOfDigits = numberOfDigits - Math.abs(numberOfDigitsWithDigit1 - numberOfDigitsWithDigit2);
        }

        return resultedNumberOfDigits;
    }
}
