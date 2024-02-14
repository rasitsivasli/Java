package Privat.DE16_LocaleDateTime.LocaleDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class LocalDte {
    public static void main(String[] args) {


        LocalDate today = LocalDate.now();// mutible
        Month ay = today.getMonth();
        System.out.println("ay = " + ay);
        DayOfWeek hGunu = today.getDayOfWeek();
        System.out.println("hGunu = " + hGunu);
        YearMonth yilVeAy = YearMonth.now();

        System.out.println("Yil ve Ay " + yilVeAy);


        System.out.println("bugun.getMonth() = " + today.getMonth());
        System.out.println("Ayin gunu = " + today.getDayOfMonth());
        System.out.println("Haftanin gunu = " + today.getDayOfWeek());

        //  -------------------------

        today = today.plusDays(40);
        System.out.println("40 gun ileri al : " + today); // gunu 40 gün iler aliyor

        today = today.minusWeeks(20);// haftayi 20 hafta geri aliyor
        System.out.println("20 hafta geri= " + today);

        today.getMonthValue();// simdiki ayi sayi olarak verir
        today = LocalDate.now();
        System.out.println("today.getDayOfMonth() = " + today.getDayOfMonth());
        System.out.println("today.getDayOfYear() = " + today.getDayOfYear());
        LocalDate aa = LocalDate.now();



    }
}

