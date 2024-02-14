package Privat.DE08_Loops.L02_WhileLoops.Tasks02;

import java.util.Scanner;

public class Task02_08_nedenCiktiDoubleYaziyoruz {
    // 1  ila 100 arasında rastgele n adet sayı üretiniz, bu sayıların %kaçı tek sayıdır
    //yazdırınız

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Randomdan üretilecek sayi adedini giriniz: ");
        int n = scanner.nextInt();
        System.out.print("Randomdan üretilen sayilar : ");

        String tek = "";
        int count = 1;

        while (n >= 1) {
            int random = (int) (Math.random() * 100);
            System.out.print(random + ",");
            if (random % 2 == 1) {
                tek += random + ",";
                count++;
            }
            n--;

        }
        System.out.println();
        System.out.println("Tek sayilar = " + tek);
        System.out.println("count = " + count);
        System.out.println("Tek sayilarin yüzdesi : "+(double)count/n*100);// bölüm tam cikmasi icin double aldik
    }
}
