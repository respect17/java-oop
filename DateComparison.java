import java.time.LocalDate;

public class DateComparison {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2024, 2, 24);
        LocalDate date2 = LocalDate.of(2023, 12, 15);

        // Comparing dates
        System.out.println("Is date1 after date2? " + date1.isAfter(date2));
        System.out.println("Is date1 before date2? " + date1.isBefore(date2));

        // Adding and subtracting days
        LocalDate newDate = date1.plusDays(10);
        System.out.println("Date after 10 days: " + newDate);
    }
}
