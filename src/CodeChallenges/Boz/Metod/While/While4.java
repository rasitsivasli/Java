package CodeChallenges.Boz.Metod.While;

import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
//     baslangic ve bitis degeri dahil aradaki sayilarin toplamini creat eden method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Baslangic sayisini giriniz : ");
        int basSayi = scanner.nextInt();
        System.out.print("Bitis sayisini giriniz : ");
        int bitSayi = scanner.nextInt();

        int sonuc = aradakilerinToplami(basSayi, bitSayi);
        System.out.println("sonuc = " + sonuc);


    }

    private static int aradakilerinToplami(int basSayi, int bitSayi) {
        int toplam = 0;
        while (basSayi <= bitSayi) {

            toplam += basSayi;
            basSayi++;
        }

        return toplam;
    }


}
