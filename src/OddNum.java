//(Calculating the Product of Odd Integers) Write an application that calculates the product
//        of the odd integers from 1 to 15.

public class OddNum {
    public static void main(String[] args) {
        int product = 1;
        for (int counter = 0; counter <= 15; counter++)
            if ( counter % 2 != 0) {
                product *= counter;
                System.out.printf("product is %d%n ", product);
            }


    }
}
