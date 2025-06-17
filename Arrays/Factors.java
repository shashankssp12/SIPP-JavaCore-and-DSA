// Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input for the number
        System.out.print("Enter a positive integer to find its factors: ");
        int number = input.nextInt();
        
        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        // Create an array to hold the factors
        int[] factors = new int[number]; // Maximum possible factors is the number itself
        int count = 0; // To keep track of the number of factors
        
        // Find factors and store them in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[count] = i;
                count++;
            }
        }
        
        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < count; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}