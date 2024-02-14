package Privat.DE08_Loops.L01_ForLoops.Task2;

import java.util.Scanner;

public class Task02_02_sorveTekrarCoz {
    public static void main(String[] args) {
        // verilen n adet sayıdan en küçüğünü bulan code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Random dan kac sayi üretmek istiyorsunuz : ");
        int n = scanner.nextInt();
        int sayi = Integer.MAX_VALUE;
        int kucuk = sayi;


//        kucuk = Integer.MAX_VALUE;// en büyük sayi olarak Integer in en büyügünü tanimladik
//        System.out.println("kucuk = " + kucuk);

        for (int i = 0; i < n; i++) {
            sayi = (int) (Math.random() * 100);/// burada yeni randomlar üretiyoruz.Her defasinda kiyaslayarak
            // for dan önce tanimladigimiz ve enKücük olarak kabul ettigimiz sayiyla kiyasliyoruz..
            System.out.print(sayi+" ");// debug da üretilen sayilari görmek icin yaptik
            if (sayi < kucuk) kucuk = sayi;


        }
        System.out.println();
        System.out.println("en kucuk : " + kucuk);
    }}


