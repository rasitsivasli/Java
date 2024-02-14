package FarukHocaYeni.DE07zIlk7dersDegerlendirmeSorulari.Level_2;

public class Q05_2 {
    public static void main(String[] args) {
        // random 1..1000 arsında random bir sayı üretiniz ( 1 ve 1000 dahil)
        // üretilen sayının basamak sayısını ekrana yazınız
        // iki farklı yöntem ile yapılması tercih edilir

        int sayi = (int) (Math.random() * 1000 + 1);
        System.out.println(sayi);

        String basamakSayisi = String.valueOf(sayi);
        System.out.println("basamakSayisi = " + basamakSayisi.length());

//        2. yol...........

        if (sayi / 1000 == 1) {
            System.out.println("sayi 4 basamaklidir ");
        } else if (sayi / 100 >= 1) {
            System.out.println("sayi 3 basamaklidir ");
        } else if (sayi / 10 >= 1) {
            System.out.println("sayi 2 basamaklidir ");
        } else System.out.println("sayi rakamdir ");


    }
}