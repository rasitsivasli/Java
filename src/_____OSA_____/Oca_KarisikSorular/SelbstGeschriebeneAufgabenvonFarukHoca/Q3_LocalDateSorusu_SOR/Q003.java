package _____OSA_____.Oca_KarisikSorular.SelbstGeschriebeneAufgabenvonFarukHoca.Q3_LocalDateSorusu_SOR;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q003 {
    public static void main(String[] args) {
        String date = LocalDate
                .parse("2014-05-04")// Tarih formatinda ve herhangi bir saat bilgisi yok
                .format(DateTimeFormatter.ISO_DATE_TIME);//Bu nedenle DateTimeFormatter kullanilamaz
        System.out.println(date);//

    }
}
