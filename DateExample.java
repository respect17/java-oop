import java.time.LocalDate;

public class DateExample {
    public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        // Create a specific date
        LocalDate customDate = LocalDate.of(2024, 2, 24);
        System.out.println("Custom Date: " + customDate);

        // Get date from string
        LocalDate parsedDate = LocalDate.parse("2024-02-25");
        System.out.println("Parsed Date: " + parsedDate);
    }
}
