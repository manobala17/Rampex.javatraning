package Day_4;
import java.util.Scanner;
public class Trafic {

        public static void main(String[] args){

            String first = "red";
            String second = "yellow";
            String third = "green";

            System.out.print("Enter the color : " );


            Scanner sc = new Scanner(System.in);
            String colorinfo = sc.nextLine();

            if(colorinfo.equals(first)) {

                System.out.println("Please Wait");

            }

            else if (colorinfo.equals(second)){
                System.out.println("Ready to go");
            }
            else if (colorinfo.equals(third)){
                System.out.println("go");
            }

            else{
                System.out.println("INAVLID COLOR");

            }
        }
    }






