package Day_7_Home_Task.java;
import java.util.Scanner;
public class GreaterThenAverage {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            int sum = 0;

            System.out.println("Enter array elements:");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum = sum + arr[i];
            }

            double average = sum / (double)n;

            int count = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] > average) {
                    count++;
                }
            }

            System.out.println("Average of array: " + average);
            System.out.println("Elements greater than average: " + count);
        }
    }

