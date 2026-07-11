package Day_7_Class_Task.Array_Task;

import java.util.Arrays;

public class Second_Max {
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 5, 4};

            int Smax = nums[0];
            int max = nums[0];

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    Smax = max;
                    max = nums[i];
                }
                else if(nums[i]>Smax){
                    Smax=nums[i];
                }
            }

            System.out.println("Array: " + Arrays.toString(nums));
            System.out.println("Maximum value: " + Smax);
        }
    }




