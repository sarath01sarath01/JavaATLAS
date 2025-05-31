package string;

public class StringCompressor {
    public static String compress(String str) {
        if(str == null || str.isEmpty()) return str;
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char current = str.charAt(0);
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == current) {
                count++;
            } else {
                compressed.append(current).append(count > 1 ? count : "");
                current = str.charAt(i);
                count = 1;
            }
        }
        compressed.append(current).append(count > 1 ? count : "");
        return compressed.toString();
    }

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compress(input));
    }

}
