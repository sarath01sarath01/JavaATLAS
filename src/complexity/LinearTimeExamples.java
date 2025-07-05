package complexity;

public class LinearTimeExamples {

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }
        return count;
    }

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println("Max number: " + findMax(numbers));
        System.out.println("Count of 1s: " + countOccurrences(numbers, 1));
        System.out.println("Reversed string: " + reverseString("algorithm"));
    }
}
