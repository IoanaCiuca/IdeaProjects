package main;

public class Prime {

    public Boolean isPrime(int number) {
        boolean is_prime=true;
        if(number<=1 || number>2 && number%2==0)
            is_prime=false;
        else
            for(int divider=3;divider*divider<=number;divider+=2)
                if(number%divider==0)
                    is_prime=false;
        return is_prime;
    }
}
