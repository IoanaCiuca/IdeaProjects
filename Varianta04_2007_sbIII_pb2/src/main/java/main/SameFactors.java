package main;

public class SameFactors {

    public String checkSameFactors(int number1, int number2, int number3) {

        Product product = new Product();
        int productDivider1 = product.product(number1);
        int productDivider2 = product.product(number2);
        int productDivider3 = product.product(number3);

        if(productDivider1 == productDivider2 && productDivider1 == productDivider3 && productDivider2 == productDivider3)
            return "Da";
        return "Nu";
    }
}
