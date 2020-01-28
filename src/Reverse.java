import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number: ");
        int number = input.nextInt();

        int reverse = 0;
        while(number != 0) {
            reverse = reverse * 10;
                    reverse = reverse + number% 10;
                    number = number / 10;
        }
        System.out.println("the reversed number is  " + reverse);
    }
}
