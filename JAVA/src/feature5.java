import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class feature5 {
    public static void main(String[] args) {
        LocalDate d=LocalDate.of(2002, Month.MAY,5);
        System.out.println(d);
        LocalTime e=LocalTime.now();
        System.out.println(e);
        LocalTime f=LocalTime.of(23,35,41);
        System.out.println(f);
        for (String s: ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }
        LocalTime t=LocalTime.now(ZoneId.of("GMT"));
        System.out.println(t);

    }
}
