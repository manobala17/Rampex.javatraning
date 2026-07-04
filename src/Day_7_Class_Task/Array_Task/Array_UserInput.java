package Day_7_Class_Task.Array_Task;
import java.util.Arrays;
import java.util.Scanner;
public class Array_UserInput {
    public static void main(String[] args){
        int[]arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i =0;i<=4;i++){
            System.out.println("Enter the number: ");
             arr[i]=sc.nextInt();

            System.out.println(Arrays.toString(arr));
        }
        System.out.println("The Values Are Updated");
    }

}
