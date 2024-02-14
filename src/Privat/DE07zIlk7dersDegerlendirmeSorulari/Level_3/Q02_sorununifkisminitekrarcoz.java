package Privat.DE07zIlk7dersDegerlendirmeSorulari.Level_3;

import java.util.Scanner;

public class Q02_sorununifkisminitekrarcoz {
    public static void main(String[] args) {
        // dd/MM/yyyy formatında string olarak iki tarih verisini okutun,
        // hangi tarih daha eski ekrana yazdırın.

        Scanner scanner = new Scanner(System.in);


        System.out.println("Birinci tarihi giriniz : ");
        String tarih = scanner.nextLine();
        int gun1 = Integer.parseInt(tarih.substring(0, 2));
        int ay1 = Integer.parseInt(tarih.substring(3, 5));
        int yil1 = Integer.parseInt(tarih.substring(6));


        System.out.println("Ikinci tarihi giriniz : ");
        String tarih2 = scanner.nextLine();
        int slasch1 = tarih.indexOf("/");
        int slasch2 = tarih.lastIndexOf("/");

        int gun2 = Integer.parseInt(tarih2.substring(0, 2));
        int ay2 = Integer.parseInt(tarih2.substring(3, 5));
        int yil2 = Integer.parseInt(tarih2.substring(6));

        // nereye kadar ilerleyecegimizi substring ten slasch a kadar da kullanabiliriz
        // ercan beyin cözümü gibi cözelim

        if (yil1 > yil2) {
            System.out.println("2. verilen tarih daha eskidir");
        } else {
            if (yil1 == yil2) {
                if (ay1 > ay2) {
                    System.out.println("2. verilen tarih daha eskidir");
                } else if (ay1 < ay2) {
                    System.out.println("1. verilen tarih daha eskidir");
                } else {
                    if (gun1 > gun2) {
                        System.out.println("2. verilen tarih daha eskidir");
                    } else System.out.println("1. verilen tarih daha eskidir");

                }

            }
        }


    }
}





