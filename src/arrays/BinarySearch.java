package arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        int[] arr = {1,10,11,23,34,36,41,78,91,92,93,100,150,197,250,251,546,1212,1343};
        int element = 41;
        int low = 0;
        int high = arr.length-1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == element) {
                System.out.println("Element found at::" + mid);
                break;
            } else if (arr[mid] > element) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }
}
