package sorting;

import java.util.Arrays;

public class MergeSortAnalysis {

    static int mergeCount = 0;
    static int comparisonCount = 0;

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Total merge operations: " + mergeCount);
        System.out.println("Total comparisons: " + comparisonCount);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if(left<right) {
            int mid = left + (right-left)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);
            System.out.println(Arrays.toString(arr));
            System.out.println("Total comparisons: " + comparisonCount);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        mergeCount++;
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = Arrays.copyOfRange(arr, left, left + n1);
        int[] rightArray = Arrays.copyOfRange(arr, mid + 1, mid + n2 + 1);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j])
                arr[k++] = leftArray[i++];
            else
                arr[k++] = rightArray[j++];
            comparisonCount++;
        }
        while (i < n1) {
            arr[k++] = leftArray[i++];
        }
        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }
}
