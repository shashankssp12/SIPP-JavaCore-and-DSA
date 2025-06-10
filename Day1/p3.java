
import java.util.Scanner;

public class p3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth number");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            int counter = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0)     
                counter++;
            }
            if(counter)
        }
        sc.close();
    }
}
