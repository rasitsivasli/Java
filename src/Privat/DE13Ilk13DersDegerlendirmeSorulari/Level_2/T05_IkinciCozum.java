package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class T05_IkinciCozum {
    public static void main(String[] args) {
        // Klavyeden okutulan stringin, içerisindeki "a" ları "k" , "k" ları ise "a" yapın
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Metin giriniz : ");
        String str = scanner.nextLine();
        str = str.replace("a", "*");
        str = str.replace("k", "a");
        str = str.replace("*", "k");

        System.out.println("str = " + str);
    }
}
