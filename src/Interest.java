//using the for statement, call the calculate Interest method
// with amount of 10000 with an interest rate of 2,3,4,5,6,7 and 8


public class Interest {
    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i +" % interest = " +  calculateInterest(10000.0,i));
        }
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
