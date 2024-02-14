package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.

        String str = "Removes white space from both ends of a string";

        // 1. yol

        int ilkUzunluk = str.length();
        int bosluklarGitti = str.trim().replace(" ", "").length();
        int kelimeSayisi = ilkUzunluk - bosluklarGitti + 1;
        System.out.println("kelimeSayisi = " + kelimeSayisi);

        // 2.Yol

        int count = 1;// ilk kelimeyi saymak icin 1 den basladim
        for (int i = 0; i < str.length(); i++) {

            str = str.trim().substring(str.indexOf(" ")+1);
            count++;

        }
        System.out.println("count = " + count);

        // 3. yol
        String str2 = "Removes white space from both ends of a string";
        String [] arr = str2.split(" ");
        System.out.println(Arrays.toString(str2.split(" ")));// yazilan stringi görmek icin yaptik
        System.out.println("arr.length = " + arr.length);
    }
}