package Privat.DE03_03ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task12 {
    /*
    Java ile kullanıcıdan alınan para değerinin KDV'li tutarını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz tutar = 10;
    KDV'li tutar = 11.8;
    KDV tutarı = 1.8;
    Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
     */

    public static void main(String[] args) {

        System.out.print("Tutari giriniz : ");
        Scanner scan = new Scanner(System.in);
        int tutar = scan.nextInt();

        if (tutar > 1000) {
            System.out.println("Kdv li tutar : " + tutar * 1.08);
            System.out.println("Kdv siz tutar : " + tutar / 1.18);
            System.out.print("Kdv tutari : " + (tutar-(tutar / 1.18)));


        }
        if (tutar == 1000) {
            System.out.println("Tutari tekrar giriniz " );

        }
            else {

            System.out.println("Kdv li tutar : " + tutar * 1.18);
            System.out.println("Kdv siz tutar : " + tutar / 1.18);
            System.out.print("Kdv tutari : " + (tutar-tutar * 0.08));
        }


    }
}
