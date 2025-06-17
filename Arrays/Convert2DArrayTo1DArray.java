//  Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and copy the 2D Array into a single dimension array Hint => 1. Take user input for rows and columns, create a 2D array (Matrix), and take the user input 2. Copy the elements of the matrix to a 1D array. For this, create a 1D array of size rows*columns as in int[] array = new int[rows * columns]; 3. Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index4. Note: For looping through the 2D array, you will need a Nested for loop, an Outer for loop for rows, and an inner for loop to access each element
import java.util.Scanner;
public class Convert2DArrayTo1DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();
        
        // Create a 2D array (Matrix)
        int[][] matrix = new int[rows][cols];
        
        // Take user input for the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Create a 1D array to hold the elements of the 2D array
        int[] array = new int[rows * cols];
        
        // Copy elements from the 2D array to the 1D array
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }
        
        // Print the elements of the 1D array
        System.out.println("Elements in the 1D array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}