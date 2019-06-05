import java.time.LocalDate;

public class ThoDatesComparison {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate future = LocalDate.of(2025, 5, 2);

        System.out.println(now.isAfter(future)); //false (if before 2 May 2025)  :)
        System.out.println(now.isBefore(future)); //true
        System.out.println(future.isAfter(now)); //true
        System.out.println(future.isBefore(now)); //false
        System.out.println(future.isEqual(now)); //false

    }
}
