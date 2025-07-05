package complexity;

public class LogarithmicTimeExamples {

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;

        }
        return result;
    }
    public static void main(String[] args) {

        int[] sortedArr = {1,5,10,12,13,19,222,500,1010,9898};
        System.out.println("Binary search for 19: " + binarySearch(sortedArr, 19));

        int[] dupArr = {1,2,2,23,36,49,49,49,49,49,55,59,75};
        System.out.println("First occurrence of 49: " + findFirstOccurrence(dupArr, 49));
    }
}
