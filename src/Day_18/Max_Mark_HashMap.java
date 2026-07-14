package Day_18;
import java.util.HashMap;
import java.util.Map;
public class Max_Mark_HashMap {
    public static void main(String[] args){

        HashMap<String,Integer>hm=new HashMap<>();

        hm.put("mano",98);
        hm.put("sanmuga",95);
        hm.put("priyan",91);
        hm.put("vetriselvan",99);

        int min=100;
        String name =" ";

        for(Map.Entry<String,Integer> e: hm.entrySet()){

            if(e.getValue()<min){

                min =e.getValue();
                name=e.getKey();
            }

        }

        System.out.println(min);
        System.out.println(name);

    }
}
