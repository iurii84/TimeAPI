import java.time.LocalDate;

public class LocalDateUsage {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now + " - time NOW");

        LocalDate after2days = now.plusDays(2);
        System.out.println(after2days + " - after 2 DAYS");

        LocalDate before1Week = now.minusWeeks(1);
        System.out.println(before1Week + " - before 1 WEEK");

        LocalDate after2Months = now.plusMonths(2);
        System.out.println(after2Months + " - after 2 MONTHS");
    }

}
