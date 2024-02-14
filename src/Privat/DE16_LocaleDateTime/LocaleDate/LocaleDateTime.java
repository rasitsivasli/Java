package Privat.DE16_LocaleDateTime.LocaleDate;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocaleDateTime {
    public static void main(String[] args) {
        LocalTime simdi = LocalTime.now();
        System.out.println(simdi);
        simdi = LocalTime.of(10,4);
        System.out.println("simdi = " + simdi);
        System.out.println("simdi.getHour() = " + simdi.getHour());
        System.out.println("simdi.getNano() = " + simdi.getNano());

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        System.out.println("dateTime.getDayOfMonth() = " + dateTime.getDayOfMonth());

    }
}
