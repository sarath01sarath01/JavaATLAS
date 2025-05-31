package string;

public class PasswordChecker {
    public static String checkPasswordStrength(String password) {
        if (password.length() < 8) {
            return "Weak: Password should be at least 8 characters long";
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c))
                hasUpper = true;
            else if (Character.isLowerCase(c))
                hasLower = true;
            else if (Character.isDigit(c))
                hasDigit = true;
            else if (!Character.isLetterOrDigit(c))
                hasSpecial = true;
        }
        int strength = 0;
        if (hasUpper)
            strength++;
        if (hasLower)
            strength++;
        if (hasDigit)
            strength++;
        if (hasSpecial)
            strength++;
        switch (strength) {
            case 4: return "Very Strong";
            case 3: return "Strong";
            case 2: return "Moderate";
            case 1: return "Weak";
            default: return "Very Weak";
        }
    }

    public static void main(String[] args) {
        String[] passwords = { "password", "Password", "Password1", "Password1!", "P@ssw0rd" };
        for (String pwd : passwords) {
            System.out.println("'" + pwd + "' is: " + checkPasswordStrength(pwd));
        }
    }

}
