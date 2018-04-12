package main;

public class S1Method {

    public int s1(int number) {
        int numberOfDigits = 0;

        while(number != 0) {
            number/=10;
            numberOfDigits++;
        }
        return numberOfDigits;
    }
}
