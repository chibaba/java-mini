
//(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
//        The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//        salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
//        total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//        these items are as follows:
//        Item   value
//        1       239.99
//        2       129.75
//        3       99.95
//        4       350.89
//         Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
//         displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
    import java.util.Scanner;
public class SalesCommission {
    public static void main(String[] args) {
        int itemCounter = 0;
        //double value = 0;
        // double earnings = value * 0.09 + 200;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter sales item sold or -1 to quit:");

        int itemSold = input.nextInt();

        while( itemSold != -1) {
         itemCounter += itemSold;
         System.out.print("Enter sales item sold or -1 to quit:");
         itemSold = input.nextInt();
        }
        if (itemSold != 0) {
            double earnings = itemSold * 0.09 + 200;
            System.out.printf("%nItemCounter of the %d itemSold entered is %d%n", itemCounter, itemSold);
            System.out.printf("Sales earnings is %f%n", earnings);
        }
        else {
            System.out.print("No itemSold was entered");
        }

    }
}
