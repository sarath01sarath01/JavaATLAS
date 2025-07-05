package complexity;

import java.util.ArrayList;
import java.util.List;

public class ExponentialTimeExamples {

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateSubsets(int[] nums, int index,
                                        List<Integer> current,
                                        List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        generateSubsets(nums, index+1, current, result);

        current.add(nums[index]);
        generateSubsets(nums, index+1, current, result);
        current.remove(current.size()-1);
    }
    public static void main(String[] args) {
        System.out.println("Fibonacci(10): " + fibonacci(10));
        int[] nums = {1, 2, 3};
        List<List<Integer>> allSubsets = subsets(nums);
        System.out.println("All subsets: " + allSubsets);
    }
}
