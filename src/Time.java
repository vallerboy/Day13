import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Time {
    public static void main(String[] args) {
        LocalDateTime localDateTime =
                LocalDateTime.of(1981, 5, 5, 0 ,0);

        System.out.println(
                Duration.between(localDateTime, LocalDateTime.now()).toHours());
    }
}
