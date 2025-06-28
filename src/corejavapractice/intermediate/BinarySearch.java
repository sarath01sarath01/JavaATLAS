package corejavapractice.intermediate;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,7,10,15,22,45,66,89,100};
        int searchItem = 22;
        int l = 0, r = arr.length-1;
        while(l<=r) {
            int mid = l+(r-l)/2;
            System.out.println(l+" "+r+" "+mid);
            int x = arr[mid];
            if(x == searchItem) {
                System.out.println("found at::"+mid);
                return;
            } else if(x > searchItem) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println("Not found");
    }
}
