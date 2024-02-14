package Privat.DE10_MethodCreation.Tasks;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class Task29 {

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
        double sayi = scanner.nextDouble();
        ucunUssuMu(sayi);
        System.out.println(ucunUssuMu(sayi));


    }

    private static boolean ucunUssuMu(double sayi) {
        boolean flag = false;
        if (sayi <= 0) {
            return flag;
        }
        for (int i = 1; i > 0; i++) {
            sayi = sayi / 3;
            if (sayi == 1) {
                flag = true;
                break;
            } else if (sayi < 1) {
                break;
            }
        }
        return flag;

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