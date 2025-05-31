package string;

public class LongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for(String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            if(word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String text = "The23231 quick brown fox jumps over the lazy dog";
        System.out.println("Longest word: " + findLongestWord(text));
    }
}
