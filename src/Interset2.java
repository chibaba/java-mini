public class Interset2 {
    //using the for statement, call the calculate Interest method
// with amount of 10000 with an interest rate of 8 to 2 percent



        public static void main(String[] args) {
            for (int i = 8; i >=2; i--) {
                System.out.println("10,000 at " + i +" % interest = " +  calculateInterest(10000.0,i));
            }
        }


        public static double calculateInterest(double amount, double interestRate) {
            return (amount * (interestRate / 100));
        }


}
