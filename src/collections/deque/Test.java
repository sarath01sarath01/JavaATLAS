package collections.deque;

public class Test {
    public static void main(String[] args) {
        StackImplementationUsingDeque<Integer> stack = new StackImplementationUsingDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(4);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
