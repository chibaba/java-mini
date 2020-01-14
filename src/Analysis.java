//A college offers a course that prepares students for the state licensing exam for real-estate
//        brokers. Last year, ten of the students who completed this course took the exam. The
//        college wants to know how well its students did on the exam. You’ve been asked to write a
//        program to summarize the results. You’ve been given a list of these 10 students. Next to
//        each name is written a 1 if the student passed the exam or a 2 if the student failed.
//        Your program should analyze the results of the exam as follows:
//        1. Input each test result (i.e., a 1 or a 2). Display the message “Enter result” on the screen
//        each time the program requests another test result.
//
import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int fails = 0;
        int studentCounter = 1;
        while( studentCounter <= 10) {
            System.out.println("Enter test result(1 = passes , 2 = fails):");
            int result = input.nextInt();

            if (result == 1) {
                passes = passes + 1;
            }
                else
                    fails = fails + 1;
                // increment student counter so that loop can terminate
                studentCounter = studentCounter + 1;
            }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, fails);

        if (passes > 8) {
            System.out.printf("Bonus to instructor");
        }
        }

    }


