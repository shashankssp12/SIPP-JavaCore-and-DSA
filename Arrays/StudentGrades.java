// - Create a program to take input marks of students in the 3 subjects physics, chemistry, and maths. Compute the percentage and then as per the calculate the grade ollowing guidelines. Store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade Hint => 1. Take input for the number of students 2. Create arrays to store marks, percentages, and grades of the students 3. Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index. Store the marks in the 2D array 4. Use the 2D array to calculate the percentages, and the grades of the students 5. Display the marks, percentages, and grades of each student
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Create a 2D array to store marks in physics, chemistry, and maths
        double[][] marks = new double[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Loop to take input for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");

            // Input for physics marks
            System.out.print("Enter marks in Physics: ");
            while (true) {
                marks[i][0] = input.nextDouble();
                if (marks[i][0] < 0) {
                    System.out.print("Please enter a positive mark: ");
                } else {
                    break;
                }
            }

            // Input for chemistry marks
            System.out.print("Enter marks in Chemistry: ");
            while (true) {
                marks[i][1] = input.nextDouble();
                if (marks[i][1] < 0) {
                    System.out.print("Please enter a positive mark: ");
                } else {
                    break;
                }
            }

            // Input for maths marks
            System.out.print("Enter marks in Maths: ");
            while (true) {
                marks[i][2] = input.nextDouble();
                if (marks[i][2] < 0) {
                    System.out.print("Please enter a positive mark: ");
                } else {
                    break;
                }
            }

            // Calculate percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            // Determine grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = "A+";
            } else if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B+";
            } else if (percentages[i] >= 60) {
                                grades[i] = "B";
            } else if (percentages[i] >= 50) {
                grades[i] = "C+";
            } else if (percentages[i] >= 40) {
                grades[i] = "C";

            } else {
                grades[i] = "F";
            }
        }
        // Display the results
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("student "+(i+1)+" secured "+grades[i]+" grade");
        
        }
    }
}