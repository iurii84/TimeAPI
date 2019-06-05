import java.time.LocalTime;

public class TwoTimesComparison {
    public static void main(String[] args) {
        LocalTime now = LocalTime.of(10, 5, 0);
        LocalTime future = LocalTime.of(17, 55, 30);
        System.out.println(now.isAfter(future)); // false
        System.out.println(now.isBefore(future)); //true
        System.out.println(future.isBefore(now)); //false
        System.out.println(future.isAfter(now)); //true
    }
}
