package sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {

        int[] arr = {4,6,6,1,1,4,5,1,8,9,1,8,3,8,9,0,1,3,0};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));

    }
    public static void countingSort(int[] arr) {

        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        int[] count = new int[max + 1];

        for (int num : arr) {
            count[num]++;
        }

        for (int num = 0, index=0; num < count.length; num++) {
            while (count[num] > 0) {
                arr[index] = num;
                index++;
                count[num]--;
            }
        }
    }
}
