import java.sql.SQLOutput;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class OldDateClass {


    public static void main(String[] args) {
        Date dateNow = new Date();
        long a = dateNow.getTime();

        try {
            TimeUnit.MILLISECONDS.sleep(10); //delay in ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date dateAfter = new Date();
        long b = dateAfter.getTime();

        int diff = (int) (b - a);

        System.out.println(diff + " milliseconds");


    }
}
