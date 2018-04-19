import java.util.ArrayList;

public class SubMethod {

    public int sub(int number, int givenDigit) {
        int resultedNumber = 0;
        int reversedNumber = reverseNumber(number);
        int numberDigit = reversedNumber%10;
        while(numberDigit != givenDigit) {
            resultedNumber = resultedNumber * 10 + numberDigit;
            reversedNumber/=10;
            numberDigit = reversedNumber%10;
            if(reversedNumber == 0)
                break;
        }

        if(reversedNumber != 0) {
            reversedNumber /= 10;
            int rest = reverseNumber(reversedNumber);
            resultedNumber = Integer.valueOf(String.valueOf(resultedNumber) + String.valueOf(rest));

        }
        return resultedNumber;
    }

    public int reverseNumber(int number) {
        int result = 0;
        while(number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }
}
