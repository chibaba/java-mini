import java.util.Scanner;
public class Prime {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("please enter a number: ");
      int prime = input.nextInt();

        if (prime >= 4 && (prime % 2 == 0 || prime % 3 == 0)) {
            System.out.print(prime + "number is not a prime");
        }
        else if (prime > 5 && prime % 5 == 0) {
            System.out.print(prime + " number is not a prime");
        }
        else if (prime > 7 && prime % 7 == 0){
            System.out.print(prime + " prime is not number");
        }
        else
        {
            System.out.println(prime + " is a prime number");
        }
        input.close();
    }
}
