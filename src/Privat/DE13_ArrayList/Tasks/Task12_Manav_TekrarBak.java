package Privat.DE13_ArrayList.Tasks;

import java.util.*;

public class Task12_Manav_TekrarBak {


    static List<String> urunListesi = new ArrayList<>(Arrays.asList("domat - urun kodu : 1", "elma - urun kodu : 2", "muz - urun kodu : 3",
            "biber - urun kodu : 4", "balcan - urun kodu : 5"));//urunlerin atanacagi bos list
    static List<Double> urunFiyatlari = new ArrayList<>(Arrays.asList(5.0, 7.5, 1.3, 8.7, 9.2));//urun fiyatlarinin atanacagi bos list
    static double toplamOdenecekTutar;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : A_Satis her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        System.out.println(urunListesi);

        toplamTutar();

    }

    private static void toplamTutar() {
        System.out.print("Almak istediginiz urun kodunu girin : ");
        int urun = scan.nextInt();
        System.out.print("Kac kg almak istediginiziz girin : ");
        int kilo = scan.nextInt();

        switch (urun) {
            case 1:
                toplamOdenecekTutar += urun * kilo * urunFiyatlari.get(0);
                System.out.print("Toplam Tutar : " + toplamOdenecekTutar + "\nIsleminizi bitirmek icin 6 \nDevam etmek icin 0 a basiniz : ");
                urun = scan.nextInt();
                if (urun == 6) toplamTutar();
                else toplamTutar();
                break;

            case 2:
                toplamOdenecekTutar += urun * kilo * urunFiyatlari.get(1);
                System.out.print("Toplam Tutar : " + toplamOdenecekTutar + "\nIsleminizi bitirmek icin 6 \nDevam etmek icin 0 a basiniz : ");
                urun = scan.nextInt();
                if (urun == 6) toplamTutar();
                else toplamTutar();
                break;
            case 3:
                toplamOdenecekTutar += urun * kilo * urunFiyatlari.get(2);
                System.out.print("Toplam Tutar : " + toplamOdenecekTutar + "\nIsleminizi bitirmek icin 6 \nDevam etmek icin 0 a basiniz : ");
                urun = scan.nextInt();
                if (urun == 6) toplamTutar();
                else toplamTutar();
                break;
            case 4:
                toplamOdenecekTutar += urun * kilo * urunFiyatlari.get(3);
                System.out.print("Toplam Tutar : " + toplamOdenecekTutar + "\nIsleminizi bitirmek icin 6 \nDevam etmek icin 0 a basiniz : ");
                urun = scan.nextInt();
                if (urun == 6) toplamTutar();
                else toplamTutar();
                break;
            case 5:
                toplamOdenecekTutar += urun * kilo * urunFiyatlari.get(4);
                System.out.print("Toplam Tutar : " + toplamOdenecekTutar + "\nIsleminizi bitirmek icin 6 \nDevam etmek icin 0 a basiniz : ");
                urun = scan.nextInt();
                if (urun == 6) toplamTutar();
                else toplamTutar();
                break;
            case 6:
                System.out.println("Cikis islemi yaptiniz. Toplam tutar : " + toplamOdenecekTutar);
                break;
            default:
                System.out.println("Yanlis giris yaptiniz");
                break;
        }
    }


}

