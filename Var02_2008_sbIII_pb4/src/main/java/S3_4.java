import java.util.HashMap;

public class S3_4 {

    public Integer f(int a) {
        int exponent = 0;
        int sum = 0;
        HashMap<Integer, Integer> exponentValues = new HashMap<>();
        for(int divider = 2; divider <= a/2; divider++) {
            if(a % divider == 0) {
                while (a % divider == 0) {
                    a /= divider;
                    exponent++;
                }
                exponentValues.put(divider, exponent);
            }
        }
        if(exponentValues.isEmpty())
            return 1;

        for(int values : exponentValues.values())
            sum += values;

        return sum;
    }

    public String extraprim(int n) {
        int digitsNumber = 0;
        int initialNumber = n;
        while(n != 0) {
            digitsNumber++;
            n /= 10;
        }
       if(digitsNumber == 1) {
           int result;
            result = f(initialNumber);
            if(result != 1)
                return "Nu";
       } else if(digitsNumber == 2) {
            int result1 = f(initialNumber);
            int reverseNumber = initialNumber % 10 * 10 + initialNumber / 10;
            int result2 = f(reverseNumber);
            if(result1 != 1 || result2 != 1)
                return "Nu";
       } else {
            int result1 = f(initialNumber);
            int reverseNumber1 = initialNumber % 10 * 100 + initialNumber/10;
            int reverseNumber2 = reverseNumber1 % 10 * 100 + reverseNumber1/100 * 10 + reverseNumber1/10%10;
            int result2 = f(reverseNumber1);
            int result3 = f(reverseNumber2);

            if(result1 != 1 || result2 != 1 || result3 != 1)
                return "Nu";
       }
        return "Da";
    }
}
