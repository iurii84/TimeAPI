import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeUsage {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now + " local Time Now");

        LocalTime after10000nanos = now.plusNanos(10000);
        System.out.println(after10000nanos + " after 10000 nanos");

        LocalTime before2millis = now.minus(Duration.ofMillis(2)); //for millis using 'Duration'
        System.out.println(before2millis + " before 2 millis");

        LocalTime after5sec = now.plusSeconds(5);
        System.out.println(after5sec + " after 5 seconds");

        LocalTime before3min = now.minusMinutes(3);
        System.out.println(before3min + " before 3 minutes");

        LocalTime after1hour = now.plusHours(1);
        System.out.println(after1hour + " after 1 Hour");

        LocalTime minusHalfOfDay = now.minus(1, ChronoUnit.HALF_DAYS); //using ChronoUnit for timing
        System.out.println(minusHalfOfDay + " before Half Of Day");

    }


}
