package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class IndirimHesaplamSorusu_If_Else_if {

//    kullanıcıdan aldığı ürün adedi ve liste fiyatını alın,
//    kullanıcıya müşteri karti olup olmadığını sorun,
//    müşteri kartı varsa 10 üründen fazla alırsa %20 yoksa %15 indirim yapın,
//    Müşteri kartı yoksa 10 üründen fazla %15,yoksa %10 indirim yapin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Müsteri Karti var mi : (varsa 'E', yoksa 'H') ");
        char musteriMi = scanner.next().toUpperCase().charAt(0);

        System.out.print("Ürün adedini giriniz : ");
        int urunAdedi = scanner.nextInt();

        System.out.print("Liste Fiyatini giriniz : ");
        double listeFiyati = scanner.nextDouble();



        if (musteriMi == 'E') {
            if (urunAdedi >= 10) {
                System.out.println("indirimli fiyat : " + urunAdedi*listeFiyati * 0.8);
            } else {
                System.out.println("indirimli fiyat : " + urunAdedi*listeFiyati * 0.85);
            }
        } else if (musteriMi == 'H') {
            if (urunAdedi >= 10) {
                System.out.println("indirimli fiyat : " + urunAdedi*listeFiyati * 0.8);
            } else {
                System.out.println("indirimli fiyat : " + urunAdedi*listeFiyati * 0.90);

            }
        } else {
            System.out.println("yanlis giris yaptiniz");


        }


    }
}
