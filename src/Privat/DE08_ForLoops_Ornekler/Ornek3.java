package Privat.DE08_ForLoops_Ornekler;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        //kullanicinin verdigi iki sayi arasinda verilen bir sayiya
        // tam bölunen bir sayi varsa , tam böl+nen var yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Birinci sayiyi giriniz : ");
        int sayi1 = scanner.nextInt();
        System.out.print(" Ikinci sayiyi giriniz : ");
        int sayi2 = scanner.nextInt();
        System.out.print(" Aranan sayiyi giriniz : ");
        int arananSayi = scanner.nextInt();

        int sayac = 0;
        for (int i = sayi1; i < sayi2; i++) {
            System.out.println("i = " + i);
            if (i % arananSayi == 0) {

                System.out.println("Aranan sayiya bölünen bir sayi vardir");
                break;
            }

//        }if (sayac>=1){
//            System.out.println("aranan say ile tam bölünebilen bir sayi vardir");
//            System.out.println("sayac = " + sayac);
//        }
        }
    }
}
