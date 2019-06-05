import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateFormatting {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        String inLineISOformat = now.format(DateTimeFormatter.BASIC_ISO_DATE); //YYYYMMDD
        System.out.println(inLineISOformat);

        String localDate = now.format(DateTimeFormatter.ISO_LOCAL_DATE); //YYYY-MM-DD
        System.out.println(localDate);

        //Created your own DateTimeFormatter
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd MMM yy");
        String myFormatterStr = now.format(myFormatter);
        System.out.println(myFormatterStr);

        DateTimeFormatter anotherFormatterWithLocale = DateTimeFormatter.ofPattern("*dd - MMM*, yyyy", Locale.FRANCE);
        String anotherFormatterString = now.format(anotherFormatterWithLocale);
        System.out.println(anotherFormatterString);
    }
}
