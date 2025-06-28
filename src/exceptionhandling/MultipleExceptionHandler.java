package exceptionhandling;

// Handling Different Exception Types

public class MultipleExceptionHandler {
    public static void main(String[] args) {
        try {
            String input = "123a";
//            int num = Integer.parseInt(input);
            int num = 0;
            int x = 10/0;
            int[] arr = new int[3];
            arr[5] = num;
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        } catch(Exception e) {
            System.out.println("New Exception:: " + e);
        }
    }
}

