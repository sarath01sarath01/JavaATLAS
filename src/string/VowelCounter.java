package string;

public class VowelCounter {
    public static void main(String[] args) {
        String text = "Hello World! Programming is fun.";
        int vowels = 0, consonants = 0;
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
