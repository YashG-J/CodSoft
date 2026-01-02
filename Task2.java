import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects:");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks of subject " + i + " (out of 100): ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double avgPercentage = (double) totalMarks / subjects;

        char grade;

        if (avgPercentage >= 90) {
            grade = 'A';
        } else if (avgPercentage >= 75) {
            grade = 'B';
        } else if (avgPercentage >= 60) {
            grade = 'C';
        } else if (avgPercentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Result");
        System.out.println("Total Marks:" + totalMarks);
        System.out.println("Average Percentage: " + avgPercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
