package Privat.DE03_03ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Task->
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        System.out.println("Mesafeyi giriniz : ");
        Scanner scan = new Scanner(System.in);
        int mesafe = scan.nextInt();
        System.out.println("Hizinizi giriniz : ");
        double hiz = scan.nextDouble();
        double sure = mesafe /hiz ;
        System.out.println("Verilen mesafeye ulasma süresi : "+ sure );



    }
}
