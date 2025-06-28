package collections.arrays;

import java.util.Arrays;
public class ArrayToString {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        String[] names = {"Alice", "Bob"};

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(matrix));

        int[][][] matrix_3d = {
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                },
                {
                        {10,11,12},
                        {13,14,15},
                        {16,17,18}
                }
        };
        System.out.println(Arrays.deepToString(matrix_3d));
    } }
