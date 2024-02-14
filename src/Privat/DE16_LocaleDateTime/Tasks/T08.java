package Privat.DE16_LocaleDateTime.Tasks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;

public class T08 {
    // doğum gününüz haftasonumudur
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(1983, 4, 24);

        LocalDate today = LocalDate.now();
        Locale locale = new Locale("tr", "TR");
        // Tarihi Türkçe ay ismiyle yazdır
        if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) System.out.println("Dogum günüm Hafta sonu");
        else System.out.println("Dogum günüm Hafta sonu degildir");

    }
}
