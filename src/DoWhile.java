import java.util.Scanner;
public class DoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        int request = 0;

        do {

            System.out.print("Enter first number");
            number = input.nextInt();
            sum = sum + number;

            System.out.print("Enter second number");
            number = input.nextInt();
            sum = sum + number;

            System.out.println("the sum of your number is " + sum);
            sum = 0;

            System.out.print("\n Type 1 to continue or type 0 to exit");
            request = input.nextInt();
        }
        while (request != 0);

    }
}
