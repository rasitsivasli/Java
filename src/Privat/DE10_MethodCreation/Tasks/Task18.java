package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

       /* Task-> girilen üç tamsaynın
        bir dik üçgenin kenar uzunlukları olma sını kontrol eden METHOD create ediniz.
        (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
         dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        dik üçgen değildir.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. kenari giriniz : ");
        int kenar1 = scanner.nextInt();
        System.out.print("2. kenari giriniz : ");
        int kenar2 = scanner.nextInt();
        System.out.print("3. kenari giriniz : ");
        int kenar3 = scanner.nextInt();

        dikUcgenMi(kenar1, kenar2, kenar3);


    }

    private static void dikUcgenMi(int kenar1, int kenar2, int kenar3) {

        if (Math.pow(kenar1, 2) + Math.pow(kenar2, 2) == Math.pow(kenar3, 2) ||
                Math.pow(kenar1, 2) == Math.pow(kenar2, 2) + Math.pow(kenar3, 2) ||
                Math.pow(kenar1, 2) + Math.pow(kenar3, 2) == Math.pow(kenar2, 2)) {
            System.out.println("Ücgen dik ücgendir");

        } else {
            System.out.println("Dik ücgen degildir");
        }
    }
}
