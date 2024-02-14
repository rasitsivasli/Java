package Privat.DE16_LocaleDateTime.Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class T03 {
    public static void main(String[] args) {
        // 100 gün sonraki tarihi ekrana yazdırınız (Türkçe ay ismi kullanarak)

        LocalDate today = LocalDate.now();
        today = today.plusDays(1000);
        Locale locale = new Locale("tr","TR");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd - MMMM - yy",locale);
        System.out.println("100 gun sonraki tarih = " + dtf.format(today));
    }
}
