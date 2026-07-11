package Day_3;
import java.util.Scanner;
public class SI {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();

            int SI =(a*b*c)/100;

            System.out.println("the simple interest is " + SI);
        }
    }

