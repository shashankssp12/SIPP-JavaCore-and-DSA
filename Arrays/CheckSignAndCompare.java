//  Write a program to take user input for 5 numbers and check whether a number is positive, negative, or zero. Further, for positive numbers check if the number is even or odd. Finally, compare the first and last elements of the array and display if they equal, greater or less Hint => 1. Define an integer array of 5 elements and get user input to store in the array. 2. Loop through the array using the length. If the number is positive, check for even or odd numbers and print accordingly 3. If the number is negative, print negative. Else if the number is zero, print zero. 4. Finally, compare the first and last element of the array and display if they equal, greater or less
import java.util.Scanner;
public class CheckSignAndCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Define an integer array of 5 elements
        int[] numbers = new int[5];
        
        // Get user input to store in the array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        // Loop through the array and check each number
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }
        
        // Compare the first and last elements of the array
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("The first and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }
    }
}