package Day_8_Class_Task;

public class ArrayReversalTwoPointers {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6};

        int left = 0;
        int right = num.length - 1;
        int temp;

        while (left < right) {
            temp = num[left];
            num[left] = num[right];
            num[right] = temp;

            left++;
            right--;
        }

        System.out.print("Reversed Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}