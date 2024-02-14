package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
            ornek
            input:1453
            output:3541

         */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = scanner.nextInt();


        sayininTersi(sayi);


    }
// 1.yol da sayiyi direkt string olarak aldim
    //    private static void sayininTersi(String sayi) {
//        String rakam;
//        String yeniSayi = "";
//
//        for (int i = 1; i <=sayi.length() ; i++) {
//
//            rakam = ""+sayi.charAt(sayi.length()-i);
//            yeniSayi += rakam ;
//        }
//        System.out.println(yeniSayi);
// }
    private static void sayininTersi(int sayi) {
        int rakam;
        String yeniSayi = "";

        for (int i = 0; i >= 0; i++) {

            rakam = sayi % 10;
            sayi = sayi / 10;
            yeniSayi += rakam;// burada srakamlari pespese eklemek icin yeni sayiyi string olarak olusturdum
            if (sayi == 0) {
                break;
            }
        }
        System.out.println(yeniSayi);
    }
}

