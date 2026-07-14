package Day_18;
import java.util.HashMap;
public class HashMapDemo {

    public static void main(String[] args){

        HashMap<Integer,String>hm=new HashMap<Integer,String>();

        hm.put(1,"vishnu");
        hm.put(2,"mano");
        hm.put(3,"sanmuga");
        hm.put(4,"priyan");
        hm.put(4,"gokul");

        hm.put(4,null);


        System.out.println(hm);

        
    }
}
