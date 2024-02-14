package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /*
    Task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */



        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        String sayi = scanner.next();

        System.out.println("basamakSayisi = " + basamakSayisi(sayi));
    }

    private static int basamakSayisi(String sayi){// yukariya int bir deger gönderecegimiz icin int yaoildi.

        return sayi.length();
    }
}
