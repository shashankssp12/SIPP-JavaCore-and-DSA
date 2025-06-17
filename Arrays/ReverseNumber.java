// Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input for the number
        System.out.print("Enter a positive integer to reverse: ");
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
        
        // Display the digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}