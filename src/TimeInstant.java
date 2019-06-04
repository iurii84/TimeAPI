import java.time.Clock;
import java.time.Instant;

public class TimeInstant {
    public static void main(String[] args) {
        try {
            testInstantFields();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testInstantFields() {
        Instant instant = Clock.systemDefaultZone().instant();


        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());

        System.out.println(instant.toEpochMilli());

        System.out.println(instant.toString());
    }
}
