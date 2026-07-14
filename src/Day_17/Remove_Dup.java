package Day_17;
import java.util.Arrays;
import java.util.TreeSet;
public class Remove_Dup {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4};
        int[] a = removeDup(arr);

        System.out.println(Arrays.toString(a));
    }

    public static int[] removeDup(int[] nums) {

        TreeSet<Integer> b = new TreeSet<>();

        for (int num : nums) {
            b.add(num);
        }

        int[] result = new int[b.size()];
        int i = 0;

        for (int num : b) {
            result[i++] = num;
        }
        return result;

    }
}




