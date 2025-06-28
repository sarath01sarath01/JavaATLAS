package arrays;

public class SearchAlgorithms {
    // Linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary search (iterative)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int[] unsortedArr = {23, 5, 16, 12, 2, 72, 56, 8, 91, 38};
        System.out.println("Linear search for 16: " + linearSearch(unsortedArr, 16));
        System.out.println("Binary search for 16: " + binarySearch(sortedArr, 16));
    }
}