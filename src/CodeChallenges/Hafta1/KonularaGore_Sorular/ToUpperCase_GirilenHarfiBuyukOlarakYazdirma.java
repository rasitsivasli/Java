package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class ToUpperCase_GirilenHarfiBuyukOlarakYazdirma {
    public static void main(String[] args) {
        //kullanicidan harf iste girilen karakter kucuk harf ise
        // buyuk harf olark yazdir
        //yoksa girilen harfi yazdir

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir harf giriniz : ");
        char ch = scanner.next().charAt(0);
        System.out.println(Character.toUpperCase(ch));



    }
}
