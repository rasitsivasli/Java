package CodeChallenges.Boz.Metod.While;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
//     Alinan bir sayidan 0 kadar olan sayilarin toplami


        int sonuc = sayilarinToplami();
        System.out.println("sonuc = " + sonuc);

    }

    private static int sayilarinToplami() {

        int sayi;
        int toplam = 0;
        int counter = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen bir sayi giriniz : ");
            sayi = scanner.nextInt();
            toplam += sayi;
            counter++;

        } while (sayi != 0);
        System.out.println("counter = " + counter);


        return toplam;
    }
}
