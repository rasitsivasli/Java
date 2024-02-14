package Privat.DE16_LocaleDateTime.LocaleDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocaleDateTime_Format {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy  hh:mm a");
        System.out.println("format = " + dtf.format(now));

        LocalDate today = LocalDate.now();

        Locale locale = new Locale("tr", "TR");

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy  hh:mm a",locale);

        System.out.println("Almanya Saati: " + dtf2.format(now));



    }
}
