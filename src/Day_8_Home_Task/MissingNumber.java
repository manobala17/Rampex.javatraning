package Day_8_Home_Task;
import java.util.Scanner;
public class MissingNumber {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter N value: ");
            int N = sc.nextInt();

            int[] arr = new int[N - 1];

            System.out.println("Enter array elements:");
            for (int i = 0; i < N - 1; i++) {
                arr[i] = sc.nextInt();
            }

            int totalSum = N * (N + 1) / 2;

            int arraySum = 0;
            for (int i = 0; i < arr.length; i++) {
                arraySum = arraySum + arr[i];
            }

            int missingNumber = totalSum - arraySum;

            System.out.println("Missing Number: " + missingNumber);

            sc.close();
        }
    }


