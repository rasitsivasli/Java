package Privat.DE03_03ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Task->
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        System.out.print("a sayisini giriniz : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.print("b. sayisini giriniz : ");
        int b = scan.nextInt();

        System.out.print("c sayisini giriniz : ");
        int c = scan.nextInt();

        double sonuc = ((double) ((a * a) - (b * b)) / (3*c)) ;
        System.out.println("Sonuc : "+ sonuc );

    }
}
