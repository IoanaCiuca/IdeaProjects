import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void afisare() {

        Singleton sing = Singleton.getInstance();
        System.out.println("===========================");
        Singleton.getInstance();Singleton.getInstance();Singleton.getInstance();Singleton.getInstance();Singleton.getInstance();

        sing.afisare("ssssss");
    }
}