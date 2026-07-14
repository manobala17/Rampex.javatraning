package Day_14_Class_Task;
import java.util.Scanner;
public class Booking {
    public static void main(String[]args) {

        try {
            bookTicket();
            System.out.println(" THANK YOU ");
            }
        catch(InvalidAgeException e){

            e.printStackTrace();

        }


    }





    public static void bookTicket() throws InvalidAgeException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age : ");
        int age =sc.nextInt();

        if(age<18){
            System.out.println("throw new ArithmeticException()");
        }else{
            System.out.println("Enter how many tickets : ");
            int tickets = sc.nextInt();
            System.out.println(tickets  +  " TICKET BOOKED ");
        }


    }
}

class InvalidAgeException extends Exception{

    InvalidAgeException(){

        super();

    }

        }