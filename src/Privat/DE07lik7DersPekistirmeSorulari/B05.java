package Privat.DE07lik7DersPekistirmeSorulari;

import java.util.Scanner;

public class B05 {
    public static void main(String[] args) {
        /* Scanner class yardımı ile klavyeden bir metin giriniz
        Örnek metinler
        "ali taş"
        "ece"
        "36.cadde 25.sokak no:42"
        "Hasan Yanal"
        tüm çözümlerinizi yukarıdaki örnek metinler ile test edin
        1) Bu metin içerisinde boşluk var ise kaçıncı indextedir ekrana yazdırın
        2) Bu metin içerisinde 3.index deki karekteri (tabi varsa) ekrana yazdırın
        3) Bu metnin, ilk 3 Karekterini ekrana yazdırın (substring)
        4) Bu metin son 2 karekteri "al" ise ekrana "bingo" yazdırın (substring kullanın)
        5) Bu metin son 2 karekteri "al" ise ekrana "bingo2" yazdırın (endsWith kullanın)
        6) Bu metnin uzunluğunu ekrana yazdırın
        7) Bu metin içerisindeki tüm "a" ları "*" yapın ve ekrana yazdırın
        8) Bu metin içerisindeki tüm rakamları silin ve ekrana yazdırın
        9) Bu metin içerisindeki kaç adet harf vardır(a..z , Baba..Z) ekrana yazdırın

         */

//      1) Bu metin içerisinde boşluk var ise kaçıncı indextedir ekrana yazdırın
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metin giriniz: ");
        String str = scanner.nextLine();

        System.out.println("boslugun Indexi : " + str.indexOf(" "));

//      2) Bu metin içerisinde 3.index deki karekteri (tabi varsa) ekrana yazdırın

        System.out.println("Metinin 3. karakteri : " + str.charAt(3));

//      3)Bu metnin, ilk 3 Karekterini ekrana yazdırın(substring)

        System.out.println("Metinin 3. karakteri : " + str.substring(0, 3));

//      4) Bu metin son 2 karekteri "al" ise ekrana "bingo" yazdırın (substring kullanın)

        System.out.println("Metinin son 2 karakteri : " + str.substring(str.length() - 2));
        System.out.println(str.substring(str.length() - 2).equals("al")? "Bingo":"degil");

//      5) Bu metin son 2 karekteri "al" ise ekrana "bingo2" yazdırın (endsWith kullanın)

        System.out.println(str.endsWith("al") ? "Bingo" : "Al degil");

//       6) Bu metnin uzunluğunu ekrana yazdırın
        System.out.println("metnin uzunlugu : "+str.length());
//
//       7) Bu metin içerisindeki tüm "a" ları "*" yapın ve ekrana yazdırın

        System.out.println(str.replace("a","*"));

//       8) Bu metin içerisindeki tüm rakamları silin ve ekrana yazdırın

        System.out.println(str.replaceAll("\\d",""));

//       9) Bu metin içerisindeki kaç adet harf vardır(a..z , Baba..Z) ekrana yazdırın

        String harfsizMetin = str.replaceAll("[a-zA-Z]","");// harfler cikarildiginda geri kalan metin

        System.out.println("harfsiz metin : "+str.replaceAll("[a-zA-Z]",""));

        System.out.println(str.length()-harfsizMetin.length());



    }
}
