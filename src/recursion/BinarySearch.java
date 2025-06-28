package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(search(arr, 15, 0, arr.length-1));
    }

    private static int search(int[] arr, int x, int low, int high) {
        if(low>high)
            return -1;
        int mid = low + (high-low)/2;
        if(arr[mid] == x) {
            return mid;
        } else if (arr[mid]>x) {
            return search(arr, x, low, mid-1);
        } else {
            return search(arr, x, mid+1, high);
        }


    }
}
