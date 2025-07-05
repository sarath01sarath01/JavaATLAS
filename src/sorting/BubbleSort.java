package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,1,5,1,6,77,24,646, 0,1,13,4,5,11};

        bubbleSort(arr, true);

        System.out.println(Arrays.toString(arr));

        bubbleSort(arr, false);
        System.out.println(Arrays.toString(arr));
        System.out.println(bubbleSort("helloworld"));
    }

    public static boolean checkIfReverse(int[] arr, boolean ascending) {
        if(ascending) {
            for(int i=0;i<arr.length-1;i++) {
                if(arr[i]<arr[i+1])
                    return false;
            }
        } else {
            for(int i=0;i<arr.length-1;i++) {
                if(arr[i]>arr[i+1])
                    return false;
            }
        }
        return true;
    }

    public static void reverse(int[] arr) {
        int l=0, r=arr.length-1;
        while (l<r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

    public static int bubbleSort(int[] arr, boolean ascending) {
        if(arr.length == 0)
            return 0;
        if(checkIfReverse(arr, ascending)) {
            reverse(arr);
            return arr.length/2;
        }
        boolean sorted = true;
        int count = 0;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(ascending) {
                    if(arr[j]<arr[i]) {
                        swap(arr, i, j);
                        sorted = false;
                        count++;
                    }
                } else {
                    if(arr[j]>arr[i]) {
                        swap(arr, i, j);
                        sorted = false;
                        count++;
                    }
                }

            }
            if(sorted)
                return 0;
        }
        return count;
    }

    public static String bubbleSort(String str) {

        char[] arr = str.toCharArray();
        if(arr.length == 0)
            return "";

        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[i])
                    swap(arr, i, j);
            }
        }

        return new String(arr);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
