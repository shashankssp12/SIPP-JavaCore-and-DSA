// Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary. Hint => 1. Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years 2. Define a double array to save salary and years of service for each of the 10 employees 3. Also define a double array to save the new salary and the bonus amount, as well as variables to save the total bonus, the total old salary, and the new salary 4. Define a loop to take input from the user. If salary or year of service is an invalid number, then ask the user to enter again. Note, in this case, you will have to decrement the index counter 5. Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop 6. Print the total bonus payout as well as the total old and new salary of all the employees
import java.util.Scanner;
public class BonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Define constants;
        final double BONUS_RATE_LONG_SERVICE = 0.05; // 5% for more than 5 years
        final double BONUS_RATE_SHORT_SERVICE = 0.02; // 2% for less than or equal to 5 years
        
        // Arrays to store employee data
        double[] salaries = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input loop for employee data
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            
            // Input salary
            System.out.print("Enter salary: ");
            while (true) {
                salaries[i] = input.nextDouble();
                if (salaries[i] < 0) {
                    System.out.print("Please enter a valid positive salary: ");
                } else {
                    break;
                }
            }
            
            // Input years of service
            System.out.print("Enter years of service: ");
            while (true) {
                yearsOfService[i] = input.nextInt();
                if (yearsOfService[i] < 0) {
                    System.out.print("Please enter a valid non-negative number of years: ");
                } else {
                    break;
                }
            }
            
            // Calculate bonus and new salary
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * BONUS_RATE_LONG_SERVICE;
            } else {
                bonuses[i] = salaries[i] * BONUS_RATE_SHORT_SERVICE;
            }
            newSalaries[i] = salaries[i] + bonuses[i];
            
            // Update totals
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.printf("\nTotal Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
                
    }
}