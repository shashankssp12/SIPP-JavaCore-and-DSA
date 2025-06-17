//  Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers

import java.util.Scanner;
public class MultipleValuesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Create an array to store 10 values
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();

            // Exit if the user entered 0 or a negative number
            if (number <= 0 || index >= 10) {
                break; // Exit the loop
            }

            // Store the number in the array and increment the index
            numbers[index] = number;
            index++;
        }

        // Calculate the total of the numbers entered
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all numbers and the total
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        
        System.out.println("Total: " + total);
    }
}