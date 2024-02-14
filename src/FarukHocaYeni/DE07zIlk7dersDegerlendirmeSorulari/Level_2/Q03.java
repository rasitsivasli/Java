package FarukHocaYeni.DE07zIlk7dersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
        "Bir web sitesi alışveriş sepet toplamı 500TL den fazla olan siparişler için kargo bedeli almıyor ,
        450 tl nin altı için 50 Tl kargo bedeli alıyor ama  alış veriş 450-500 arası ise 500 e tamamlanıyor
        Alış veriş bedeli girildiğinde, kargo dahil toplam ödenecek tutarı ekrana yazdıran proğram"
        Önnekler    input : 540 , output 540
                    input : 480 , output 500
                    input : 420 , output 470


         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Alisveris tutarinizi giriniz : ");
        double tutar = scanner.nextDouble();

        if (tutar >= 500) {
            System.out.println("Toplam tutar : " + tutar);
        } else if (tutar >= 450) {
            System.out.println("Toplam tutar : " + "500 tl");

        } else System.out.println("Toplam tutar : " + (tutar + 50));

    }
}
