package complexity;

import java.util.Arrays;

public class LinearithmicExamples {
    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);
            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);
        }
    }
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    public static void heapSort(int[] arr) {

        for (int i = arr.length / 2 - 1; i >= 0; i--)
            minHeapify(arr, arr.length, i);

        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            minHeapify(arr, i, 0);
        }
    }
    private static void minHeapify(int[] arr, int n, int i) {
        int left = i*2+1;
        int right = i*2+2;
        if(left>=n)
            return;
        if(right>=n)
            right = left;
        int min = i;
        if(arr[min]>arr[left])
            min = left;
        if(arr[min]>arr[right])
            min = right;
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
        if(i!=min)
            minHeapify(arr, n, min);
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        mergeSort(arr);
        System.out.println("Merge sorted: " + Arrays.toString(arr));
        int[] arr2 = {4, 10, 3, 5, 1, 9, 6, 2};
        heapSort(arr2);
        System.out.println("Heap sorted: " + Arrays.toString(arr2));
    }
}
