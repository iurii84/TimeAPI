import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class SetDateOrTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1984, 4, 7);
        System.out.println(date + " setting Day, Month and Year");

        LocalTime time = LocalTime.of(15, 30, 12);
        System.out.println(time + " setting Hour, Minutes and Seconds");

        LocalDateTime dayPlusTime = LocalDateTime.of(date, time);
        System.out.println(dayPlusTime + " day plus time");

        LocalDate dateMonth = LocalDate.of(2015, Month.DECEMBER, 31); //using Month.* syntaxis
        System.out.println(dateMonth + " using Month.* syntaxis");
    }
}
