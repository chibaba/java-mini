
import java.security.SecureRandom;
public class RandomNumbers {
    public static void main(String... args) {
        SecureRandom number = new SecureRandom();

        for (int nums = 0; nums <= 20; nums++) {
            int cal = 1 + number.nextInt();
            if (nums % 3 == 0)
                System.out.println(nums);
        }
    }

}
