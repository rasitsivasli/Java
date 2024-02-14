package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task29_While {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = scanner.nextInt();

        System.out.println("sonuc : "+ucunUssuMu(sayi));


    }

    private static boolean ucunUssuMu(double sayi) {

        while (sayi % 3 == 0) {
            sayi /= 3;
        }

        return sayi==1;
    }


}
//    public static boolean powerOfThree(int n) {
//        if (n <= 0) {
//            return false; // Negatif veya sıfır 3 üssü olamaz.
//        }
//
//        while (n % 3 == 0) {
//            n /= 3;
//        }
//
//        return n == 1;
//    }