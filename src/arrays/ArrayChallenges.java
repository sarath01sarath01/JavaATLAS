package arrays;

import java.util.Arrays;

public class ArrayChallenges {
    // Reverse an array
    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // Find the kth largest element
    public static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    // Remove duplicates from sorted array
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex + 1;
    }

    // Rotate array by k positions
    public static void rotateArray(int[] arr, int k) {
        k = k % arr.length;
        if (k < 0) k += arr.length;
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original array: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
        System.out.println("3rd largest: " + findKthLargest(arr, 3));
        int[] dupArr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength = removeDuplicates(dupArr);
        System.out.println("Array after removing duplicates: " +
                Arrays.toString(Arrays.copyOf(dupArr, newLength)));
        rotateArray(arr, 3);
        System.out.println("Array rotated by 3: " + Arrays.toString(arr));
    }
}