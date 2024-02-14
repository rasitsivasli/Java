package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class T05_StringdeHarflerinYeriniDegistir {
    public static void main(String[] args) {
        // Klavyeden okutulan stringin, içerisindeki "a" ları "k" , "k" ları ise "a" yapın
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Metin giriniz : ");
        String str = scanner.nextLine();
        String yeniStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a') {
                ch = 'k';
            } else if (ch == 'k') {
                ch = 'a';
            }yeniStr+=ch;

        }
        System.out.println("str = " + yeniStr);
    }
}
