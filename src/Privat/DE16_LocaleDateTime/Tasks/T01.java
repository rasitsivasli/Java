package Privat.DE16_LocaleDateTime.Tasks;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class T01 {
    public static void main(String[] args) {
        // 100 gün sonraki tarihi ekrana yazdırınız

        LocalDate today = LocalDate.now();
        System.out.println(today.plusDays(100));
        System.out.println(today.plusDays(100).getDayOfWeek());
        // Şu anki tarihi al
        Locale locale = new Locale("de", "DE");

        // WeekFields sınıfı bize yilin haftasinin ve ayin haftasi gibi sayilari veriri
        WeekFields kacinciHafta = WeekFields.of(locale);
        int haftaNumarasi = today.get(kacinciHafta.weekBasedYear());

        System.out.println("Şu anki hafta numarası: " + haftaNumarasi);

    }
}
