package Day_17;
import java.util.ArrayList;
import java.util.LinkedList;
public class ArrayLinkedList {
    public static void main(String[] args)throws InterruptedException{

        long start=System.nanoTime();

        ArrayList<Integer>arr=new ArrayList<>();
        LinkedList<Integer>li=new LinkedList<>();


        for(int i =0;i<10000;i++){

            arr.add(i);
        }
        long end =System.nanoTime();
        System.out.println("Added in Array list : " + System.nanoTime());
    }
}
