package Privat.DE10_MethodCreation.Quiz;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /* Ekrandan   nextLine ile bir string okutun ve bu stringin, ilk kelimesinin
        uzunluğunu ekrana yazdırın.
        a) bir metot çağırın ve her şeyi metot ta yapın
        b) String okuma işini main de yapın, hesaplama ve yazdırma metot ta olsun
        c) hesaplama metotta , okuma ve yazma işleri main de olsun
         */
        ekranYazisi();// kullanicinin ilk gördügü ekran

    }

    private static void ekranYazisi() {
        System.out.print("Bir metin giriniz : ");
        scanner();
    }

    private static void scanner() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        ilkKelime(str);
    }

    private static void ilkKelime(String kelime) {
        String ilkKelime = kelime.substring(0, kelime.indexOf(" "));
        ilkKelimeUznunlugu(ilkKelime);

    }

    private static void ilkKelimeUznunlugu(String ilkKelime) {
        int uzunluk = ilkKelime.length();
        yazdirUzunluk(uzunluk);
    }

    private static void yazdirUzunluk(int uzunluk) {
        System.out.println("ilk kelimenin uzunlugu : " + uzunluk);
    }
}
