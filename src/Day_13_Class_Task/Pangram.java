package Day_13_Class_Task;

public class Pangram {
    public static void main(String[] args) {
    String s ="mano";

    int count =0;
    for(int i=0;i<s.length();i++ ) {

        for (int j = 0; j < s.length(); j++) {

            if(s.charAt(i)==s.charAt(j)){
                count ++;
            }
        }
        System.out.println(s.charAt(i)+ " : "+count);
        count=0;

    }

}
}