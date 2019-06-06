import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TimeShiftingByZones {
    private static final LocalDateTime TIME_IN_MONTREAL_NOW = LocalDateTime.now();

    public static void main(String[] args) {
        List<String> allZonesList = new ArrayList<>(ZoneId.getAvailableZoneIds());

        Map<String, String> timeZonesMap = allZonesList.stream()
                .collect(Collectors.toMap(zone -> zone, TimeShiftingByZones::getShifting));

        TreeMap<String, String> sortedMap = new TreeMap<>(timeZonesMap);
        sortedMap.forEach((zone, shifting) -> System.out.println(zone + " " + shifting));
    }

    private static String getShifting(String zone) {
        ZonedDateTime zonedDateTime = TIME_IN_MONTREAL_NOW.atZone(ZoneId.of(zone));
        return zonedDateTime.getOffset().getId().replace("Z", "+00:00");
    }
}
