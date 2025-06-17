//  Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
// Hint => 1. Get an integer input from the user, assign it to a variable number, and check for a Natural Number. If not a natural number, then print an error and exit the program 2. Create a for loop to iterate from 6 to 9 3. Inside the loop, multiply the number by the loop index and print the result
import java.util.Scanner;   
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input for the number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        
        // Check if the number is a natural number
        if (number < 1) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return;
        }
        
        // Create a multiplication table from 6 to 9
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}