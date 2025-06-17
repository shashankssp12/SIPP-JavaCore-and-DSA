
// An organization took up an exercise to find the Body Mass Index (BMI) of all the team members. For this, create a program to find the BMI and display the height, weight, BMI, and status of each individual. Use a multi-dimensional array to store height, weight, and BMI in the 2D array for all the persons Hint => 1. Take input for the number of persons and create a multi-dimensional array to store weight, height, and BMI. Also create a to store the weight status of the persons double[][] personData = new double[number][3]; String[] weightStatus = new String[number]; 2. Take input for weight and height of the person, and for negative values, ask the user to enter positive values 3. Calculate BMI of all the persons and store them in the personData array, and also find the weight status and put them in the weightStatus array 4. Display the height, weight, BMI, and status of each person 5. Use the table to determine the weight status of the person
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = input.nextInt();

        // Create a 2D array to store weight, height, and BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Loop to take input for each person
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");

            // Input for weight
            System.out.print("Enter weight (kg): ");
            double weight = input.nextDouble();
            while (weight <= 0) {
                System.out.print("Please enter a positive weight: ");
                weight = input.nextDouble();
            }

            // Input for height
            System.out.print("Enter height (m): ");
            double height = input.nextDouble();
            while (height <= 0) {
                System.out.print("Please enter a positive height: ");
                height = input.nextDouble();
            }

            // Calculate BMI
            double bmi = weight / (height * height);
            personData[i][0] = weight; // Store weight
            personData[i][1] = height; // Store height
            personData[i][2] = bmi; // Store BMI

            // Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display the results
        System.out.println("\nBMI Results:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(m)", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", personData[i][0],personData[i][1],personData[i][2],weightStatus[i]);
        }

    }
}