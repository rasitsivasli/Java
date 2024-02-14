package Privat.DE03_03ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /* Task->
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */


        System.out.print("1. dik kenar uzunlugunu giriniz : ");
        Scanner scan = new Scanner(System.in);
        int kenar1= scan.nextInt();

        System.out.print("2. dik kenar uzunlugunu giriniz : ");
        int kenar2= scan.nextInt();
        int hipotenus = kenar1*kenar1+kenar2*kenar2;
        System.out.println("Hipotenus = "+ Math.sqrt(hipotenus));



    }
}
