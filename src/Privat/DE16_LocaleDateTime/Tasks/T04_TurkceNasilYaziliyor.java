package Privat.DE16_LocaleDateTime.Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class T04_TurkceNasilYaziliyor {
    public static void main(String[] args) {
        // Hangi gün doğduğunuzu (Pazartesi, salı... v.b.) ekrana yazdırın

        LocalDate date = LocalDate.of(1983,4,19);
        Locale locale = new Locale("tr", "TR");
        // Tarihi Türkçe ay ismiyle yazdır
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yy EEEE ",locale);
        System.out.println("dtf.format(date) = " + dtf.format(date));
    }
}
