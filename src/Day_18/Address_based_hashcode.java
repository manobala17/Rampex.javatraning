package Day_18;

public class Address_based_hashcode {

    public static void main(String[] args) {

        java.util.ArrayDeque<Integer> dq = new java.util.ArrayDeque<>();

        dq.add(5);
        dq.add(6);
        dq.add(3);


        String name = "mano";
        String name1 = "mano";

        String name2 = new String("mano");
        String name3 = new String("mano");

        System.out.println(System.identityHashCode(name));
        System.out.println(System.identityHashCode(name1));


    }
}


