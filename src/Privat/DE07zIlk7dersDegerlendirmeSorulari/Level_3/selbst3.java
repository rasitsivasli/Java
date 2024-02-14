package Privat.DE07zIlk7dersDegerlendirmeSorulari.Level_3;

import java.util.Scanner;

public class selbst3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Metin giriniz : ");
        String str = scanner.nextLine();
//        System.out.println(str.indexOf("at"));
//        System.out.println(str.lastIndexOf("at"));
//        System.out.println(str.indexOf(' '));
//        System.out.println(str.lastIndexOf(" "));
//        System.out.println(str.indexOf("a", str.lastIndexOf(" ")));
//
//        int sayi1 = 5;
//        int sayi2 = 2;
//        double sonuc =  sayi1*1.0 / sayi2;
//        System.out.println("sonuc = " + sonuc);

//        System.out.println(str.indexOf("top",str.indexOf("top")+1));


//        Soru;bir metinde kac defa at kelimesi olup olmadigini bulalim
        int toplam = 0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.contains("at")){
                toplam=toplam+1;
            }
        }
        System.out.println("toplam = " + toplam);
//        String str2 = str.replaceAll("at","");  /// metin de kac adet "at" var..
//        System.out.println(str.length()-str2.length());
    }
}
