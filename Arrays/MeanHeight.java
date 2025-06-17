//  Create a  of players inprogram to find the mean height a football team. Hint => 1. The formula to calculate the mean is: mean = sum of all elements/number of elements 2. Create a double array named heights of size 11 and get input values from the user. 3. Find the sum of all the elements present in the array. 4. Divide the sum by 11 to find the mean height and print the mean height of the footballteam.

import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Create an array to hold the heights of 11 players
        double[] heights = new double[11];
        
        // Get input values from the user
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }
        
        // Calculate the sum of all elements in the array
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }
        
        // Cal mean height
        double meanHeight = sum / heights.length;
        
        // Print the mean height
        System.out.printf("The mean height of the football team is: %.2f meters%n", meanHeight);
        
    }
}
