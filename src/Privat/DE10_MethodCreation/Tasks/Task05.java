package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        /* Task-> girilen iki sayıyı seçilen dört işleme göre
         hesaplayıp print eden METHOD create ediniz
        işlem toplam ise sayıları toplayın, çarpma ise çarpın .....v.b.
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Toplama icin 1: \nCikarma icin 2:\nCarpma icin 3:\nBölme icin 4: ");
        int secim = input.nextInt();
        System.out.print("1. sayiyi giriniz : ");
        int num1 = input.nextInt();
        System.out.print("2. sayiyi giriniz : ");
        int num2 = input.nextInt();

        hesaplama(secim, num1, num2);

    }//main sonu

    public static void hesaplama(int secim, int a, int b) {

        switch (secim) {
            case 1:
                System.out.println("toplam = " + a + b);
                break;
            case 2:
                System.out.println("toplam = " + (a - b));
                break;
            case 3:
                System.out.println("Fark = " + (a * b));
                break;
            case 4:
                System.out.println("Bolüm = " + (a * 1.0 / b));
                break;
            default:
                System.out.println("Yanlis giris yaptiniz");
        }

    }

}
