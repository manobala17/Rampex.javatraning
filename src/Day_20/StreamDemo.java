package Day_20;

import java.util.Arrays;
public class StreamDemo {
    public static void main(String[] args){

        int[]arr={4,3,6,1,9,2,5,8,7};

        Arrays.stream(arr).filter((n)->n%2==0).sorted().forEach(n->System.out.print(n));
    }
}
