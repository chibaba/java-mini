 // SUM OF THE FIRST 20 INT NUMBERS
public class Sum {
    public static void main(String[] args) {
        int sum = 0;
//        int counter = 0;
        for (int counter = 0; counter <= 20; counter++) {
            if (counter % 2 == 0)
                sum +=counter;
            System.out.printf("Sum is %d%n ", sum);
        }
    }
}
