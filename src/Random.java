import java.security.SecureRandom;
import java.util.Scanner;

public class Random {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[]  args) {
        System.out.print("please guess the correct number: ");

        SecureRandom randomNumbers = new SecureRandom();

        int number = 1 + randomNumbers.nextInt(13);

        int collectedNumber = input.nextInt();



         while ( collectedNumber != number) {
             if (collectedNumber > number ) {
                 System.out.print("please guess a bit lower");
             }
             if (collectedNumber < number) {
                 System.out.print("please guess a bit higher");
             }
             System.out.println("enter number");
             collectedNumber = input.nextInt();
         }

        System.out.println("Correct you got the answer");

    }
}
