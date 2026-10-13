package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for nested loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P38_AverageValues.png">
 */
public class P38_AverageValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = 3;
        int subjects = 4;
        // Write your program here
        // Hint: Use nested loops to read grades for each student/subject and calculate average
        int sum = 0;
        for (int student = 1; student <= students; student++) {
            for (int subject = 1; subject <= subjects; subject++) {
                System.out.println("Enter grade for student " + student + ", " + subject);
                int subject_mark = scanner.nextInt();
                sum = sum + subject_mark;
                if (subject == 4) {
                    double average = (double) sum/4;
                    System.out.printf("Student %d average: %.2f\n\n", student, average);
                    sum = 0;
                }
            }
        }

        // format output
        // System.out.printf("Student %d average: %.2f\n\n", student, average);
    }
}
