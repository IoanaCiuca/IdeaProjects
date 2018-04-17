package main;

public class Product {

    public int product(int number) {
        int productDivider = 1;

        Prime isPrime = new Prime();

        if(isPrime.isPrime(number))
            return number;
        for(int divider = 2; divider * divider <= number; divider++)
            if(number%divider==0)
                if(isPrime.isPrime(divider))
                    productDivider *= divider;

        return productDivider;
    }
}
