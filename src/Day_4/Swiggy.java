package Day_4;
import java.util.Scanner;
public class Swiggy {

        public static void main (String[] args){

            int first = 1;
            int second = 2;
            int third = 3;
            int fourth = 4;

            System.out.print("WELCOME TO 2.5 STAR HOTEL !!!\n ");

            System.out.println("1. VEG");
            System.out.println("2. NON VEG");
            System.out.println("3. SWEETS AND DESSERTS");
            System.out.println("4. EXIT");
            System.out.println("Enter The Number To Order Dish:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if(num==first){

                System.out.println("VEG \n Paneer Butter Masala\n Vegetable Biryani\n Vegetable Fried Rice\n Curd rice\n Lemon Rice");
            }

            else if(num==second){

                System.out.println("NON VEG\n Chicken Biryani\n Butter Chicken\n Chicken Tikka Masala\n Chicken Chettinad\n Mutton Biryani\n Mutton Curry\n Mutton Sukka");

            }

            else if(num==third){

                System.out.println("SWEETS AND DESSERTS\n Gulab Jamun\n Rasgulla\n Moong Dal Halwa\n Kulfi\n Lassi");
            }

            else if(num==fourth){

                System.out.println("THANK YOU VISITING");

            }
            else{

                System.out.println("INAVLID ORDER NUMBER");
            }
        }
    }

