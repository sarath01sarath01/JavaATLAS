package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
//        int[] arr = {1,4,1,5,1,6,77,24,646, 0,1,13,4,5,11};
//        insertionSort(arr, true);
//        System.out.println(Arrays.toString(arr));
//        insertionSort(arr, false);
//        System.out.println(Arrays.toString(arr));
        int[] arr2 = {1,4,1,5,1,6,77,24,646, 0,1,13,4,5,11};
        insertionSort2(arr2);
        insertionSort(arr2, true);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Comparisions::"+insertionSort(arr2, true));
    }



    public static int insertionSort(int[] arr, boolean ascending) {
        int count = 0;
        for(int i=1;i<arr.length;i++) {
            int item = arr[i];
            int j = i-1;
            for(;j>=0 && arr[j]>item;j--) {
                arr[j + 1] = arr[j];
                count++;
//                System.out.println(Arrays.toString(arr));
            }
            arr[j+1] = item;
            System.out.println(Arrays.toString(arr));
        }
        if(!ascending) {
            reverse(arr);
        }
        return count;
    }

    public static void insertionSort2(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int item = arr[i];
            int j = i-1;
            for(;j>=0 && arr[j]<item;j--) {
                arr[j + 1] = arr[j];
            }
            arr[j+1] = item;
        }
    }

    public static void reverse(int[] arr) {
        int l=0, r=arr.length-1;
        while (l<r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

}
