package Privat.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task2_3Cözüm {
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
        int sayac = 0;

        for (int i = 0; i < uzunluk; i++) {
            if (str.charAt(i) == str.charAt(sonIndex - i)) {
                sayac++;
            }
        }
        if (sayac == uzunluk) {
            System.out.println("polindromdur");
        } else {
            System.out.println("polindrom degildir");
        }
    }
}
