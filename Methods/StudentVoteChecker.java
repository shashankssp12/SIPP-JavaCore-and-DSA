import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            boolean canVote = canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") can vote? " + (canVote ? "Yes" : "No"));
        }
        sc.close();
    }
}

