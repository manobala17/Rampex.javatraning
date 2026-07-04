package Day_7_Class_Task.Array_Task;
import java.util.Arrays;
public class Max_Array {
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 5, 4};

            int max = nums[0];

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }

            System.out.println("Array: " + Arrays.toString(nums));
            System.out.println("Maximum value: " + max);
        }
    }

