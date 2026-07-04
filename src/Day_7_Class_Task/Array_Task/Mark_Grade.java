package Day_7_Class_Task.Array_Task;
import javax.swing.*;
import java.util.Scanner;
public class Mark_Grade {
    public static void main(String[] args){
        int[] mark = new int[5];

        float  markspercentage = 0;
        int totalmarks=0;
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter your name: " );
        String name=sc.nextLine();

        for( int i=0;i<5;i++) {
            System.out.println("Enter the mark: ");
            mark[i] = sc.nextInt();


            totalmarks =totalmarks+ mark[i];
            markspercentage = totalmarks / 5.0f;

        }

        System.out.println("Congrats "+ name + " you have scored "+ totalmarks +" and you got a "+ markspercentage  + " Percentage");
    }
}

