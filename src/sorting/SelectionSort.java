package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,1,5,1,6,77,24,646, 0,1,13,4,5,11};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[minIndex])
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
