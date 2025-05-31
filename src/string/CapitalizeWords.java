package string;

public class CapitalizeWords {
    public static String capitalize(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(String word : words) {
            if(word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String text = "hello world! java programming is FUN.";
        System.out.println("Original: " + text);
        System.out.println("Capitalized: " + capitalize(text));
    }

}
