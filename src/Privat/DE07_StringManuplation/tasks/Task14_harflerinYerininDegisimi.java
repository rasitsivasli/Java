package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class Task14_harflerinYerininDegisimi {
    public static void main(String[] args) {
        /* Harflerden oluşan bir stringin içindeki tüm "a" leri, "e" ve
        tüm "e" leri "a" yapınız
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cumle giriniz : ");
        String str = scanner.nextLine();

        String strDegisen = str.replace("a","*");
        System.out.println(strDegisen);

        String strDegisen2 = strDegisen.replace("e","a");
        System.out.println("strDegisen2 = " + strDegisen2);

        System.out.println(strDegisen2.replace("*","e"));



    }
}
