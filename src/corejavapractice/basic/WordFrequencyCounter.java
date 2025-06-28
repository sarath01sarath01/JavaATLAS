package corejavapractice.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string::");
        String str = sc.nextLine();
        String[] items = str.split("\\s+");
        System.out.println(Arrays.toString(items));
        Map<String, Integer> counter = new HashMap<>();
        for(String item: items) {
            counter.put(item, counter.getOrDefault(item, 0)+1);
        }

        System.out.println(counter.toString());
    }
}
