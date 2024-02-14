package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {


        //kullanıcıdan alınan 3 basamakli bir tam sayı(degilse tekrar sayi istendin) , random dan gelen sayidan kücükse,
//   iki sayi toplansin ,büyükse farki alinsin

        Scanner scanner = new Scanner(System.in);
        System.out.print(" 3 basamakli bir sayi giriniz : ");
        int sayi1 = scanner.nextInt();


        if (sayi1 > 99 && sayi1 < 1000) {
            int sayi2 = (int) (Math.random() * 1000);
            System.out.println("sayi2 = " + sayi2);
            boolean durum = sayi1 > sayi2;
            if (durum) {
                System.out.println("toplam : " + (sayi1 + sayi2));
            } else if (sayi2 > sayi1) {
                System.out.println("fark : " + (sayi1 - sayi2));

            } else System.out.println("sayilar esittir..");
        } else System.out.println("Sayi 3 basamakli degildir");
    }
}
