package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class _05_String_methods02 {

    public static void main(String[] args) {

    /*    Sprint planning olan bir String oluşturun.
        Bu dizenin toplam karakter sayısını yazdırın.   */

        //Kodu aşağıya yazınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle girin");
        String str = scanner.nextLine();
        System.out.println("harf sayisi : " + str.length());
    }
}
