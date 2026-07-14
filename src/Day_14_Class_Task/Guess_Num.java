package Day_14_Class_Task;
import java.util.Scanner;
public class Guess_Num {
        public static void main (String [] args){
            Scanner sc = new Scanner(System.in);
//        double num = Math.random();
            int rNum = (int) (10 * Math.random());
//        System.out.println(num);
//        int n = (int)num;
//        System.out.println(n);
//        System.out.println("Enter the Number: ");
            System.out.println("Guess the Number: ");
            int num = sc.nextInt();
            if(num == rNum){
                System.out.println("You won!!!");
            }else{
                System.out.println("You lose!!! it is " + rNum);
            }
        }
    }

