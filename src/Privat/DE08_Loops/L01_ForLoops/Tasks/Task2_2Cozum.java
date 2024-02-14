package Privat.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task2_2Cozum {

    public static void main(String[] args) {
        /* Task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :
        örnekler
        "ece"
        "ada"
        "ey edip adanada pide ye"

         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir metin  giriniz : ");
        String str = scanner.nextLine();

        int uzunluk = str.length();
        int sonIndex = uzunluk - 1;
        boolean polidromdur = true;

        for (int i = 0; i < uzunluk/2; i++) {
            if (str.charAt(i) != str.charAt(sonIndex - i)) {
                polidromdur = false;
            }
        }

        if (polidromdur) {
            System.out.println("polindromdur");
        } else {
            System.out.println("polindrom degildir");

        }
    }
}


