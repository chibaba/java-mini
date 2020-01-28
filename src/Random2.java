public class Random2 {
    public static void main(String args[]) {
        int x = 1;
        for (int u = 1; u <= 5; u++) {
            for (int j = 1; j >= u; j--) {
                System.out.print(" ");
            }
            for (int f = 1; f <= x; f++) {
                System.out.print(u);
            }
            x = x + 2;
            System.out.println();
        }
    }
}
