package debugging;

public class OffByOneBug {
    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 8, 11, 12, 15, 19, };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
