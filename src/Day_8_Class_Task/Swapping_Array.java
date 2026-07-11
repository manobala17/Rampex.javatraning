package Day_8_Class_Task;
import java.util.Arrays;
public class Swapping_Array {
    public static void main(String[] args){

        int[] num ={1,2,3,4};
        int n = num.length;

        System.out.println(Arrays.toString(num));

        int temp = 0;

        for(int i=0;i<num.length/2;i++){

            temp=num[i];
            num[i]=num[n-1-i];
            num[n-1-i]=temp;
        }
        System.out.println(Arrays.toString(num));
    }
}
