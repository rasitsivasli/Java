package Privat.DE16_LocaleDateTime.Tasks;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class T09 {
    // bulunduğunuz ülke ile newYork arasındaki saat farkını yazdırın
    public static void main(String[] args) {

        LocalTime usaTime = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println("usaTime = " + usaTime);
        LocalTime deTime = LocalTime.now();
        System.out.println("deTime = " + deTime);
        Duration fark = Duration.between(usaTime,deTime);

//        int fark = deTime.getHour() - usaTime.getHour();
//        System.out.println("fark = " + fark);


    }
}
