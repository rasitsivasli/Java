package Privat.DE16_LocaleDateTime;

import java.time.LocalDate;
import java.time.Month;

public class C12_OCA {
    public static void main(String[] args) {
        /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */

        LocalDate date = LocalDate.of(2018, Month.APRIL, 28);
        date.plusDays(2);
        date.plusYears(3);
////////////  Atama olmadigi icin veriler degismez.. Tarih ayni kalir
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
/*
            Baba. 2018 APRIL 28
            Cocuk. 2018 APRIL 30
            C. 2018 MAY 2
            D. 2021 APRIL 2
            E. 2021 APRIL 30
            F. 2021 MAY 2
            G. Baba runtime exception is thrown.
 */


    }
}
