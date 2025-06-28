package arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr1 = new int[5]; // Declaration with size
        int[] arr2 = {10, 20, 30, 40, 50}; // Declaration with initialization
        int[] arr3 = new int[]{5, 10, 15}; // Alternative initialization
// Array traversal techniques
        System.out.println("For loop:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
        System.out.println("\nEnhanced for loop:");
        for (int num : arr3) {
            System.out.println(num);
        }
        System.out.println("\nWhile loop:");
        int i = 0;
        while (i < arr1.length) {
            arr1[i] = (i + 1) * 100; // Initialize values
            System.out.println(arr1[i]);
            i++;
        }
    }
}
