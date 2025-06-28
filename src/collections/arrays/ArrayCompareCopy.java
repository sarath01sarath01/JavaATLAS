package collections.arrays;

import java.util.Arrays;
public class ArrayCompareCopy {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {4, 5, 6};
        int[] arr4 = new int[10];
        for(int i=0;i<10;i++) {
            arr4[i] = i+1;
        }

        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("arr1 == arr2? " + isEqual);

        int[] copy = Arrays.copyOf(arr1, arr1.length);
        System.out.println("Copied array: " + Arrays.toString(copy));

        System.out.println(copy == arr1);

        int[] extendedCopy = Arrays.copyOf(arr1, 5);
        System.out.println("Extended copy: " + Arrays.toString(extendedCopy));

        int[] rangedCopy = Arrays.copyOfRange(arr4, 4, 8);
        System.out.println("Ranged copy::" + Arrays.toString(rangedCopy));
    } }