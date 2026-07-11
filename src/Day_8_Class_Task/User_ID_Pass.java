package Day_8_Class_Task;
import java.util.Scanner;
public class User_ID_Pass {
    public class user_id_and_password {
        public static void main(String[] args) {
            String userId = "mano9826";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your user id : ");
            String InputId = sc.nextLine();
            if (InputId.equals(userId)) {
                System.out.println("Welcome");
            } else {
                System.out.println("Enter correct user id");
            }

        }
    }
}
