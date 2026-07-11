package Day_3;
import java.util.Scanner;
public class Login_details {
        public static void main(String[]args){
            String originalUsername = "Mano";
            int originalpass =9826;

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the username:");
            String username =sc.nextLine();

            System.out.print("Enter the pass:");

            int pass = sc.nextInt();

            if(originalUsername.equals(username)&& originalpass == pass){
                System.out.print("welcome!!");
            }else{
                System.out.print("Invalid credentials");
            }
        }
    }
