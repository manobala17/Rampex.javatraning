package Day_18;
import java.util.ArrayDeque;
public class Queue_Task {

    public static void main(String[] args){

        String[] task = {"download","compile","test","deploy"};

        ArrayDeque<String>dq=new ArrayDeque<String>();

        for(String t:task ){
            dq.add(t);
        }
        for(String t : dq) {
            System.out.print(t+"->");
        }
    }
}
