package Privat.DE07zIlk7dersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*  Klavyeden okutulan ondalıklı bir sayının , ondalık kısmını ekran yazdırınız
        Örnek : input  : 3.435 ,
                output : 0.435
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("double sayı: ");
        double db = scanner.nextDouble();

        String sayi = String.valueOf(db);

        System.out.println("0"+"."+sayi.substring(2));
    }
}
