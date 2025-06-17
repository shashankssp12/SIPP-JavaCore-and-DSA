// Create a program to take a number as input, find the frequency of each digit in the number using an array, and display the frequency of each digit Hint => 1. Take the input for a number 2. Find the count of digits in the number 3. Find the digits in the number and save them in an array4. Find the frequency of each digit in the number. For this, define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit 5. Display the frequency of each digit in the number
import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Validate input
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        // Convert the number to a string to easily access each digit
        String numberStr = String.valueOf(number);
        int length = numberStr.length();
        
        // Create an array to hold the digits
        int[] digits = new int[length];
        
        // Fill the digits array
        for (int i = 0; i < length; i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        
        // Create a frequency array for digits 0-9
        int[] frequency = new int[10];
        
        // Calculate the frequency of each digit
        for (int digit : digits) {
            frequency[digit]++;
        }
        
        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}