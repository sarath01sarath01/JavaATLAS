package string;

public class StringToInt {
    public static int convert(String str) throws NumberFormatException {
        int result = 0;
        boolean isNegative = false;
        int i = 0;
        if(str.charAt(0) == '-') {
            isNegative = true;
            i = 1;
        }
        for(; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= '0' && c <= '9') {
                result = result * 10 + (c - '0');
            } else {
                throw new NumberFormatException("Invalid character: " + c);
            }
        }
        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        String numStr = "-12345";
        try {
            System.out.println("Converted integer: " + convert(numStr));
        } catch(NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
