import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Time {
    public static void main(String[] args) {
        LocalDateTime localDateTime =
                LocalDateTime.of(1981, 5, 5, 0 ,0);

        System.out.println(
                Duration.between(localDateTime, LocalDateTime.now()).toHours());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse("1921-11-11 13:40:20", formatter);
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(myFormatter.format(now));
    }
}
