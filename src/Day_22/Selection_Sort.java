package Day_22;

import java.util.Arrays;

class Select_Sort {

    public static void main(String[] args) {

        int[] arr = {5, 1, 3, 4, 2};

        selectionsort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void selectionsort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}