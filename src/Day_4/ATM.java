package Day_4;
import java.util.Scanner;
public class ATM {

        static boolean checkPin(int pin) {
            return pin >= 1000 && pin <= 9999;
        }

        static boolean checkAmount(int amount) {
            return amount > 0;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (!checkPin(pin)) {
                System.out.println("Invalid PIN");
                return;
            }

            System.out.print("Enter amount to withdraw: ");
            int amount = sc.nextInt();

            if (!checkAmount(amount)) {
                System.out.println("Invalid Amount");
                return;
            }

            System.out.println("Transaction Successful");
            System.out.println("Withdrawn Amount: " + amount);

            sc.close();
        }
    }

