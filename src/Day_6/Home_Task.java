package Day_6;
import java.util.Scanner;
public class Home_Task {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int balance = 5000;
            int choice;

            do {

                System.out.println("----- ATM PROGRAM -----");
                System.out.println("1. Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                if (choice == 1) {

                    System.out.println("Your Balance is: " + balance);

                } else if (choice == 2) {

                    System.out.print("Enter deposit amount: ");
                    int deposit = sc.nextInt();

                    balance = balance + deposit;

                    System.out.println("Deposit Successful");
                    System.out.println("Updated Balance: " + balance);

                } else if (choice == 3) {

                    System.out.print("Enter withdraw amount: ");
                    int withdraw = sc.nextInt();

                    if (withdraw <= balance) {

                        balance = balance - withdraw;

                        System.out.println("Withdraw Successful");
                        System.out.println("Remaining Balance: " + balance);

                    } else {

                        System.out.println("Insufficient Balance");

                    }

                } else if (choice == 4) {

                    System.out.println("Thank you for using ATM");

                } else {

                    System.out.println("Invalid Choice");

                }

            } while (choice != 4);


            sc.close();
        }
    }


