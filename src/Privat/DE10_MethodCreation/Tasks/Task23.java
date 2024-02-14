package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task23 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> vucüt kitleendexini print eden METHOD create ediniz
        vki->kg(mt*mt)
     18,5 kg/m2 ve daha düşük değerler = Zayıf.
     18,5 ve 24,9 kg/m2 arasındaki değerler = Normal ağırlıkta.
     25,0 ve 29,9 kg/m2 arasındaki değerler = Kilolu.
     30,0 ve üstü =  obezite.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();
        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        double boy = scanner.nextDouble();

        System.out.println("vke = " + vki(kilo, boy));


    }//main sonu

    private static double vki(double kilo, double boy) {
        double sonuc = kilo /(boy * boy);

        if (sonuc >= 30.0) {
            System.out.println("obezite");
        } else if (sonuc >= 25.0) {
            System.out.println("kilolu");

        } else if (sonuc >= 18.5) {
            System.out.println("normal");
        } else if (sonuc < 18.5) {
            System.out.println("zayif");
        } else {
        }
        return sonuc;
    }


}
