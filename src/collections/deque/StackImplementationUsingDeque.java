package collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackImplementationUsingDeque<T> {
    Deque<T> dq = new ArrayDeque<>();
    public void push(T item) {
        dq.push(item);
    }
    public T pop() {
        return dq.pop();
    }

    @Override
    public String toString() {
        return dq.toString();
    }
}
