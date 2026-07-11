package Day_5;
import java.util.Scanner;
public class SumOfEvennumber {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n=sc.nextInt();

            int sum = 0;

            for(int i = 2; i <= n; i += 2) {
                sum = sum + i;
            }

            System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);

            sc.close();
        }
    }


