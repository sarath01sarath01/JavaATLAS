package string;

public class EmailValidator {

    public static boolean isValidEmail(String email) {
        // Basic email validation regex
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    public static void main(String[] args) {
        String[] emails = { "test@example.com", "invalid.email", "another.test@domain.co.uk", "wrong@.com" };
        for(String email : emails) {
            System.out.println(email + " is valid? " + isValidEmail(email));
        }
    }

}
