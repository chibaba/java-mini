import java.util.Scanner;

public class Multiplication {
    public static void main(String[]   args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number: ");

        int number = input.nextInt();
        for (int counter = 1; counter < 13; counter++) {
            System.out.println(number + " X " + counter + " = " + counter*number);
        }
    }
}
