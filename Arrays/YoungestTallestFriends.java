// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages, and the tallest among the friends based on their heights Hint =>1. Take user input for age and height for the 3 friends and store it in two arrays, each to store the values for age and height of the 3 friends 2. Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends 3. Finally display the youngest and tallest of the 3 friends
import java.util.Scanner;
public class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        // Input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = input.nextDouble();
        }
        
        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        
        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        // Display the results
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");
    }
}