package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayApplications {
    // Generate random array
    public static int[] generateRandomArray(int size, int min, int max) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(max - min + 1) + min;
        }
        return arr;
    }

    // Calculate moving average
    public static double[] movingAverage(int[] arr, int windowSize) {
        double[] result = new double[arr.length - windowSize + 1];
        double windowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            windowSum += arr[i];
        }
        result[0] = windowSum / windowSize;
        for (int i = 1; i < result.length; i++) {
            windowSum = windowSum - arr[i - 1] + arr[i + windowSize - 1];
            result[i] = windowSum / windowSize;
        }
        return result;
    }

    // Find subarray with maximum sum (Kadane's algorithm)
    public static int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] randomArr = generateRandomArray(10, 1, 100);
        System.out.println("Random array: " + Arrays.toString(randomArr));
        double[] movingAvg = movingAverage(randomArr, 3);
        System.out.println("Moving averages: " + Arrays.toString(movingAvg));
        int[] testArr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum: " + maxSubarraySum(testArr));
    }
}