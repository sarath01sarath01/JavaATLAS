package collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;
public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() <= 1) return true;
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                deque.addLast(Character.toLowerCase(c));
            }
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] testCases = {
                "A man, a plan, a canal: Panama",
                "racecar",
                "hello",
                "No 'x' in Nixon"
        };

        for (String test : testCases) {
            System.out.printf("'%s' is palindrome? %b%n", test, isPalindrome(test));
        }
    }
}