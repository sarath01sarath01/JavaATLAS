package string;

import java.util.HashMap;
import java.util.Map;

public class TextAnalyzer {
    public static void countWords(String text) {
        String[] words = text.split("\\s+");
        System.out.println("Total words: " + words.length);
    }
    public static void characterFrequency(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        String sampleText = "Hello world! This is a sample text for analysis.";
        countWords(sampleText);
        characterFrequency(sampleText);
    }
}
