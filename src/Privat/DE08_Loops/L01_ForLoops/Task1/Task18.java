package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task18 {

    /*
    Task-> Girilen bir tamsayının  3 un üssü olup olmadığınıkontrol eden code create ediniz.
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

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        boolean ucunKuvvetiMi = false;
        // int sayac =0;

        for (int i = 1; i <= sayi; i *= 3) {/// i*=3 islemi her zaman 3 ün kuvvetlerini verir
            if (sayi == i) {
                ucunKuvvetiMi = true;
              //  ikinci yol sayac++;
            }
        }
        if (ucunKuvvetiMi) { // ikinci yol if (sayac>0)

            System.out.println("3.ün kuvvetidir");

        } else {
            System.out.println("3.ün kuvveti degildir");

        }
    }


}

