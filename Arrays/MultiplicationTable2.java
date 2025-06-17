// Create a program to print a multiplication table of a number. Hint => 1. Get an integer input and store it in the number variable. Also, define an integer array to store the results of multiplication from 1 to 10 2. Run a loop from 1 to 10 and store the results in the multiplication table array 3. Finally, display the result from the array in the format number * i = ___
import java.util.Scanner;
public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input for the number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = input.nextInt();
        
        // Define an array to store the multiplication results
        int[] multiplicationTable = new int[10];
        
        // Run a loop from 1 to 10 and store the results in the array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }
        
        // Display the results in the specified format
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
    }
}