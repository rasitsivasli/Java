package Privat.DE07zIlk7dersDegerlendirmeSorulari.Level_3;

import java.util.Scanner;

public class selbst5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Bir metin girniz : ");
        String str = scanner.nextLine();
        //  metin deki tüm sayilari ve space disindaki özel karakterleri temizle

        str = str.replaceAll("\\d","").replaceAll("\\W","");
        System.out.println(str);

        // J1*2av4.a C67/an=+dir--
    }
}
