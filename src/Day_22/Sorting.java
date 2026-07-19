package Day_22;
import java.util.Arrays;
public class Sorting {

    public static void main(String[] args) {

        int[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 10, 5};
        bubbleSort(arr);

    }

    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        int temp = 0;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        System.out.print(Arrays.toString(arr));
    }
}


