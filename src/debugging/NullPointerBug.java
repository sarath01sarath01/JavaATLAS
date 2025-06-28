package debugging;

import java.util.Objects;

public class NullPointerBug {
    public static void main(String[] args) {
        String message = null;
        if (!Objects.isNull(message)) {
            System.out.println("Message is not empty");
        }
    }
}