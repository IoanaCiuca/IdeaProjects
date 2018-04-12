package main;

public class S2Method {

    public int s2(int number, int digit) {
        int resultedNumber = 0;
        int divisionReminder;
        int power = 1;
        while(number != 0) {
            divisionReminder = number%10;
            resultedNumber = resultedNumber + divisionReminder * power;
            power*=10;
            if(divisionReminder == digit) {
                resultedNumber = resultedNumber + divisionReminder * power;
                power*=10;
            }
            number/=10;
        }
        return resultedNumber;
    }
}
