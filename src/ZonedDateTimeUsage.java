import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ZonedDateTimeUsage {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);


        LocalDate date = LocalDate.of(2017, 12, 31);
        LocalTime time = LocalTime.of(23, 59);

        ZoneId zoneOfParis = ZoneId.of("Europe/Paris");
        ZonedDateTime timeInParis = ZonedDateTime.of(date, time, zoneOfParis);
        System.out.println(timeInParis + " time in Paris");


        //converting between the time zones
        ZoneId zoneOfMtl = ZoneId.of("America/New_York");
        ZonedDateTime mtlTime = timeInParis.withZoneSameInstant(zoneOfMtl);
        System.out.println(mtlTime);

        //get ALL time zones
        List<String> allZones = new ArrayList<>(ZoneId.getAvailableZoneIds());
        allZones.forEach(System.out::println);


    }
}
