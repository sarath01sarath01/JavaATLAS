package complexity;

import java.util.ArrayList;
import java.util.List;

public class FactorialTimeExamples {
    public static List<List<Integer>> permutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }
    private static void backtrack(int[] nums, List<Integer> temp,
                                  List<List<Integer>> result) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int num : nums) {
            if (temp.contains(num)) continue;
            temp.add(num);
            backtrack(nums, temp, result);
            temp.remove(temp.size()-1);
        }
    }

    public static int tsp(int[][] graph) {
        int n = graph.length;
        int[] vertices = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            vertices[i] = i+1;
        }
        int minPath = Integer.MAX_VALUE;
        List<List<Integer>> allPerms = permutations(vertices);
        for (List<Integer> perm : allPerms) {
            int currentWeight = 0;
            int k = 0;
            for (int i = 0; i < perm.size(); i++) {
                currentWeight += graph[k][perm.get(i)];
                k = perm.get(i);
            }
            currentWeight += graph[k][0];
            minPath = Math.min(minPath, currentWeight);
        }
        return minPath;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("All permutations: " + permutations(nums));
        int[][] graph = {
                {0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}
        };
        System.out.println("TSP shortest path: " + tsp(graph));
    }
}
