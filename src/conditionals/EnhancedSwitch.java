package conditionals;

public class EnhancedSwitch {
    public static void main(String[] args) {
        String month = "FEB";
        int days = switch (month) {
            case "JAN", "MAR", "MAY", "JUL", "AUG", "OCT", "DEC" -> 31;
            case "APR", "JUN", "SEP", "NOV" -> 30;
            case "FEB" -> {
                System.out.println("February has 28 or 29 days");
                yield 28;
            }
            default -> 0;
        };
        System.out.println(month + " has " + days + " days");
    }
}
