import java.time.LocalDateTime;

public class LocalDateTimeUsage {
    //this class delegate all methods of LocalTime and LocalDate
    //Some examples:


    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now + " local Date & Time Now");

        LocalDateTime after2Years3Months1Day4Hours20min = now
                .plusYears(2)
                .plusMonths(3)
                .plusDays(1)
                .plusHours(4)
                .plusMinutes(20);
        System.out.println(after2Years3Months1Day4Hours20min + " after 2 Years, 3 Months, 1 Day, 4 Hours, 20 Minutes");

    }
}
