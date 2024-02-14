package Privat.DE13_ArrayList.Tasks;

import java.util.Scanner;

public class _11_prime_numbers_AsalSayi {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num = scanner.nextInt();

        int count = 0;

        for (int i = 2; i <= num; i++) {// en kücük asala sayi 2 dir, 2 den basladik
            if (sayiAsalMi(i)) {// her bir sayiyi kontrol etmek icin buraya bir method tanimlandi
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\ncount = " + count);
    }

    private static boolean sayiAsalMi(int sayi) {// buradaki sayi yukaridan i den geliyor
        for (int j = 2; j <= sayi / 2; j++) {// sirayla sayi kendinden önceki sayilara bölündü
            // yarisina kadar baktik asalliga bakmak icin yarisindan sonraya gerek yok
            if (sayi % j == 0) return false;
        }
        return true;
    }

}






