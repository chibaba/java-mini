// find the smallest and largest number
import java.util.Scanner;
public class SmallestAndLargest {
    public static void main(String... args) {
       Scanner input = new Scanner(System.in);
      // System.out.println("Enter Number");
        System.out.println("Enter number and \"and ctrl d\" to cancel");

        int number = input.nextInt();
       int smallest = 0;
       int largest = 0;
       int currentNumber = input.nextInt();
       smallest = currentNumber; largest = currentNumber;
       while (number!=0) {
          // System.out.println("Enter number");
            number = input.nextInt();
               if (number < smallest) {
                   smallest = number;
               } else {
                   largest = number;
               }


           }
        System.out.printf("Smallest Number is %d %n Largest Number is %d", smallest, largest);
        }
}
