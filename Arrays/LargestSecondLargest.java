//  Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
import java.util.Scanner;
public class LargestSecondLargest {
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
        
        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // Find the largest and second largest elements
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit < largest) {
                secondLargest = digit;
            }
        }
        
        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}