package Privat.DE16_LocaleDateTime.Tasks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class T05 {
    public static void main(String[] args) {
        LocalDateTime simdi = LocalDateTime.now();

        int x = 1000; // x saat
        LocalDateTime gelecekTarihSaat = simdi.plusHours(x);
        Locale locale =  new Locale("de","DE");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMMM-dd EEEE HH:mm:ss",locale);

        System.out.println(x + " saat sonraki Tarih: " + gelecekTarihSaat.format(dtf));


    }
}
