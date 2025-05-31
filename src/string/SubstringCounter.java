package string;

public class SubstringCounter {

    public static int countSubstring(String str, String subStr) {
        int count = 0;
        int index = 0;
        while((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "ababababa";
        String sub = "aba";
        System.out.println("'" + sub + "' appears " + countSubstring(text, sub) + " times");
    }

}
