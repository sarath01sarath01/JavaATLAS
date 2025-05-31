package string;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
// Remove whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
// Check length
        if (str1.length() != str2.length()) {
            return false;
        }
// Convert to char array and sort
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        String[][] testCases = {
                {"listen", "silent"},
                {"Hello", "World"},
                {"Dormitory", "Dirty room"},
                {"Apple", "Pale"}
        };
        for (String[] pair : testCases) {
            System.out.printf("'%s' and '%s' are anagrams? %b%n",
                    pair[0], pair[1], areAnagrams(pair[0], pair[1]));
        }
    }
}
