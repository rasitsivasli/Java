package Privat.DE03_03ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        //Kodu aşağıya yazınız.
        System.out.print("Kilonuzu giriniz : ");
        Scanner scan = new Scanner(System.in);
        byte agirlik = scan.nextByte();
        System.out.println("agirlik = " + agirlik);


    }
}
