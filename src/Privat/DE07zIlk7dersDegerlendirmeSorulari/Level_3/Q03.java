package Privat.DE07zIlk7dersDegerlendirmeSorulari.Level_3;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //  dd/MM/yyyy formatında string olarak iki tarih verisini okutun,
        //  2. tarih daha ileri bir tarih olsun
        //  2. tarih ile birinci tarih arasında kaç gün fark vardır
        //  ( yıllar 365, aylar 30 gün olarak hesaplanacak)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci tarihi giriniz : ");
        String tarih = scanner.nextLine();
        int gun1 = Integer.parseInt(tarih.substring(0, 2));
        int ay1 = Integer.parseInt(tarih.substring(3, 5));
        int yil1 = Integer.parseInt(tarih.substring(6));


        System.out.println("Ikinci tarihi giriniz : ");
        String tarih2 = scanner.nextLine();
        int gun2 = Integer.parseInt(tarih2.substring(0, 2));
        int ay2 = Integer.parseInt(tarih2.substring(3, 5));
        int yil2 = Integer.parseInt(tarih2.substring(6));

        System.out.println(("Fark : ")+(yil2-yil1)+" yil "+(ay2-ay1)+" ay "+(gun2-gun1)+" gündür");

    }
}
