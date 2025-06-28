package corejavapractice.basic;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,6,7,8,9,10};
        int l=0, r=arr.length-1;
        while(l<r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
