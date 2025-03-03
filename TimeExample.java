import java.time.LocalTime;

public class TimeExample {
    public static void main(String[] args) {
        // Get the current time
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);

        // Create a specific time
        LocalTime customTime = LocalTime.of(15, 30, 45); // 3:30:45 PM
        System.out.println("Custom Time: " + customTime);

        // Get time from string
        LocalTime parsedTime = LocalTime.parse("12:15:30");
        System.out.println("Parsed Time: " + parsedTime);
    }
}
