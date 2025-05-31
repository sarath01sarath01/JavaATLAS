package operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = -5; // Binary: 0101
        int b = 3; // Binary: 0011
        System.out.println("a & b = " + (a & b)); // Bitwise AND (0001 = 1)
        System.out.println("a | b = " + (a | b)); // Bitwise OR (0111 = 7)
        System.out.println("a ^ b = " + (a ^ b)); // Bitwise XOR (0110 = 6)
        System.out.println("a << 1 = " + (a << 1)); // Left shift (1010 = 10)
        System.out.println("~a = " + (~a)); // Bitwise complement (1010 = -6)
        System.out.println("a >> 1 = " + (a >> 1)); // Signed right shift (0010 = 2)
        System.out.println("a >>> 1 = " + (a >>> 1)); // Unsigned right shift
// Practical use: checking if number is even
        int num = 8;
        System.out.println(num + " is even: " + ((num & 1) == 0));
    }
}
