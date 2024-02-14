package Privat.DE08_Loops.L01_ForLoops.Task2;

import java.util.Scanner;

public class Task02_05_NtaneUretilenSayidanCiftleriBulma {
    public static void main(String[] args) {
        // 1 ila 10 arasında rastgele üretilen n adet sayının  çift olanlarını ekrana yazınız

        Scanner scanner = new Scanner(System.in);
        System.out.println("Random dan kac sayi üretmek istiyorsunuz : ");
        int n = scanner.nextInt();
        String sayi = "";
        System.out.print("üretilen sayilar : ");
        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random() * 9 + 1);
            System.out.print(random + ",");

            if (random % 2 == 0) {
                sayi = sayi + random+",";/// 2.seferde gelene sayi : ""2,  3.seferde gelen sayi: ""2,4.......

            }
        }
        System.out.println();
        System.out.print("cift sayilar : " + sayi);
    }
}
