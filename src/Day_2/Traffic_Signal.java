package Day_2;
import java.util.Scanner;
public class Traffic_Signal {
        public static void main(String[]args){
            String colour = "green";
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the color : ");
            String crt_colour=sc.nextLine();
            if(crt_colour.equals(colour)){
                System.out.print("go");
            }else{
                System.out.print("stop");
            }
        }
    }

