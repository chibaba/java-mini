  import java.util.Scanner;

// implementing sentinel controlled repetition

public class ClassAverage {

    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade or -1 to quit:");

        int grade  = input.nextInt();

        while(grade != -1 ) {

            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter grade or -1 to quit:");
            grade = input.nextInt();
        }

        if (gradeCounter != 0){
            double average = (double) total / gradeCounter;
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else
            System.out.println("No grades was entered");


    }
}
