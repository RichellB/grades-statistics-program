import java.util.Scanner;

public class GradeStatistics {

    public static void main (String[] args) {

        // variable declarations and initializations
        float avg;
        float sum = 0;
        float min = 999;
        float max = -1;

        // accepting grades from user
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the grades for 10 students: ");
        
        // calculating the average, minimum and maximum grades
        for (int counter = 1; counter < 11; counter++) {
            float grade = input.nextFloat();
            sum += grade;

            if (grade < min) {
                min = grade;
            }
            if (grade > max) {
                max = grade;
            }
        }

        avg = sum / 10;
        
        // displaying results to user
        System.out.println("\nThank you!\n");
        System.out.println("The average grade is: " + avg + "%.");
        System.out.println("The lowest grade is: " + min + "%.");
        System.out.println("The highest grade is: " + max + "%.");

    }
}
