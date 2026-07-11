package Day_5;
import java.util.Scanner;
public class Product {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int product = 1;

            for(int i = 2; i < n; i++) {
                if(i % 2 != 0) {
                    product = product * i;
                }
            }

            System.out.println(product);
        }
    }
