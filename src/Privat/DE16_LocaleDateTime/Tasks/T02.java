package Privat.DE16_LocaleDateTime.Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class T02 {
    public static void main(String[] args) {
        // 1 yıl sonraki tarihi  ekrana yazdırınız (dd - MM - yy) formatı kullanarak

        LocalDate today = LocalDate.now();
        today = today.plusDays(1000);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd - MM - yy");
        System.out.println("100 gun sonraki tarih = " + dtf.format(today));

    }
}
