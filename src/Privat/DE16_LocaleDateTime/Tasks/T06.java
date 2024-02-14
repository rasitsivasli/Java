package Privat.DE16_LocaleDateTime.Tasks;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class T06 {
    // doğum gününüzden bugüne kadar geçen gün sayısını bulunuz
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        System.out.println("Bugün: " + bugun);

        LocalDate dogumGunu = LocalDate.of(1983, 4, 19);
        System.out.println("Doğum Günü: " + dogumGunu);


        Period period = Period.between(dogumGunu,bugun);
        System.out.println(period.getDays());


        int gecenYilSayisi = (int) ChronoUnit.YEARS.between(dogumGunu, bugun);
        System.out.println("gecenYilSayisi = " + gecenYilSayisi);
        int gecenAySayisi = (int) ChronoUnit.MONTHS.between(dogumGunu, bugun);
        System.out.println("gecenGünSayisi = " + gecenAySayisi);
        int gecenGunSayisi = (int) ChronoUnit.DAYS.between(dogumGunu, bugun);
        System.out.println("gecenGunSayisi = " + gecenGunSayisi);




    }
}
