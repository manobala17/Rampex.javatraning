package Day_4;
import java.util.Scanner;
public class hotel2 {

        public static void main(String[] args) {

            System.out.print("WELCOME TO 2.5 STAR HOTEL !!!\n");

            System.out.println("Enter The Number To Order Dish:");
            System.out.println("1. VEG");
            System.out.println("2. NON VEG");
            System.out.println("3. SWEETS AND DESSERTS");
            System.out.println("4. EXIT");

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            switch(num) {

                case 1:
                    System.out.println("VEG");
                    System.out.println("Paneer Butter Masala");
                    System.out.println("Vegetable Biryani");
                    System.out.println("Vegetable Fried Rice");
                    System.out.println("Curd Rice");
                    System.out.println("Lemon Rice");
                    break;

                case 2:
                    System.out.println("NON VEG");
                    System.out.println("Chicken Biryani");
                    System.out.println("Butter Chicken");
                    System.out.println("Chicken Tikka Masala");
                    System.out.println("Chicken Chettinad");
                    System.out.println("Mutton Biryani");
                    System.out.println("Mutton Curry");
                    System.out.println("Mutton Sukka");
                    break;

                case 3:
                    System.out.println("SWEETS AND DESSERTS");
                    System.out.println("Gulab Jamun");
                    System.out.println("Rasgulla");
                    System.out.println("Moong Dal Halwa");
                    System.out.println("Kulfi");
                    System.out.println("Lassi");
                    break;

                case 4:
                    System.out.println("THANK YOU FOR VISITING");
                    break;

                default:
                    System.out.println("INVALID ORDER NUMBER");
            }

            sc.close();
        }
    }

