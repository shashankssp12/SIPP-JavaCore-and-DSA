// Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array Hint => 1. Get an integer input from the user, assign it to a variable number, and check for a Natural Number. If not a natural number, then print an error and exit the program 2. Create an integer array for even and odd numbers with size = number / 2 + 1 3. Create index variables for odd and even numbers and initialize them to zero 4. Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array 5. Finally, print the odd and even numbers array using the odd and even index
import java.util.Scanner;
public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //input for the numbers
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        
        // Check if the number is a natural number
        if (number < 1) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return;
        }
        
        // Create arrays for odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        
        // Index variables for odd and even numbers
        int evenIndex = 0;
        int oddIndex = 0;
        
        // Loop from 1 to the number and fill the arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Save even number
            } else {
                oddNumbers[oddIndex++] = i; // Save odd number
            }
        }
        
        // Print the even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
        
        // Print the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}