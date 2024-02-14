package Privat.DE07_StringManuplation.tasks02;

import java.util.Scanner;

public class Task02_07 {
    public static void main(String[] args) {
        // iki string veriliyor, birinci stringin 3. karekterini alın
        // bu karekter , ikinci stringde varsa oradan silin
        // input :  str1 = selamlar
        //          str2 = merhabalar
        // output   str2=  merhblr
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci metin giriniz : ");
        String str1 = scanner.nextLine();
        System.out.print("Ikinci metin giriniz : ");
        String str2 = scanner.nextLine();

        String sonDurum = null;
        String ch = str1.substring(3,4);

        if (str2.contains(ch)){

            sonDurum= str2.replace(ch,"");
            System.out.println("sonDurum = "+sonDurum);
        } else System.out.println("Birinci Stringin 3. karakteri 2. String de yoktur..");



    }
}
