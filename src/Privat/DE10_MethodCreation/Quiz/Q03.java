package Privat.DE10_MethodCreation.Quiz;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        ekrandan okuttuğunuz bir string, her bir karekterinin ascII karşılıklarını,
        toplatıp yazdırın. char ın ascıı rakam karşılığı metot ta hesaplansın.
         */


        String str = "Nasilsin?";
        int toplam = asciiToplam(str);
        System.out.println("toplam = " + toplam);
    }

    private static int asciiToplam(String str) {
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            toplam += ch;
        }
        return toplam;
    }
}
