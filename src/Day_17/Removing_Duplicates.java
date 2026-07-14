package Day_17;
import java.util.ArrayList;
import java.util.Arrays;

public class Removing_Duplicates {
    public static void main (String[] args){


        int[] arr = {1,2,2,3,4,5,5,5,6};

        ArrayList<Integer> a= new ArrayList<>();
        ArrayList<Integer> b= new ArrayList<>();

        for(int i : arr){
            a.add(i);
        }
        boolean dup =false;
        for(int i =0;i<a.size();i++){
            for(int j=0;j<a.size();j++) {
                if (a.get(i).equals(a.get(j))) {
                    dup = true;
                    break;
                }
            }if(dup==false){
                b.add(a.get(i));
            }
            System.out.print(b);
        }
    }
}
