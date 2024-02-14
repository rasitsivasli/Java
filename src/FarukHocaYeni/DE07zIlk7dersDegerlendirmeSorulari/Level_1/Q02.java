package FarukHocaYeni.DE07zIlk7dersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /* Klavyeden girilen 3 double sayının toplamını wrapper class yardımı ile yazdırınız.
        toplama '+' işareti kullanılmayacak.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("ilk double sayı: ");
        double sayi1 = scanner.nextDouble();
        System.out.println("ikinci double sayı: ");
        double sayi2 = scanner.nextDouble();
        System.out.println("üçüncü double sayı: ");
        double sayi3 = scanner.nextDouble();

        // Math sınıfı kullanarak sayıları toplama
        double toplam = Double.sum(sayi1,sayi2);
        double toplamSon = Double.sum(toplam,sayi3);

        System.out.println("Girilen sayıların toplamı: " + toplamSon);
    }
}
