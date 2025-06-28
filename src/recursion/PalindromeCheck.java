package recursion;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "nonon";
        String str2 = "moon";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str2));
    }

    private static boolean isPalindrome(String str) {
        if(str.length()<=1 )
            return true;
        if(str.charAt(0) != str.charAt(str.length()-1))
            return false;
        return isPalindrome(str.substring(1, str.length()-1));
    }
}
