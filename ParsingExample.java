import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class ParsingExample {
    public static void main(String[] args) {
        // Parsing a date (Converting String to LocalDate)
        LocalDate parsedDate = LocalDate.parse("2024-02-24");
        System.out.println("Parsed Date: " + parsedDate);

        // Parsing a time (Converting String to LocalTime)
        LocalTime parsedTime = LocalTime.parse("15:30:45");
        System.out.println("Parsed Time: " + parsedTime);

        // Parsing a date-time (Converting String to LocalDateTime)
        LocalDateTime parsedDateTime = LocalDateTime.parse("2024-02-24T15:30:45");
        System.out.println("Parsed Date-Time: " + parsedDateTime);
    }
}
