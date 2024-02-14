package Privat.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task02_1Cozum {
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
        String tersStr = "";//bos bir String kutu kulah

        int uzunluk = str.length();

        for (int i = uzunluk - 1; i >= 0; i--) {

            tersStr += str.charAt(i);

        }
        if (str.equals(tersStr))
        {
            System.out.println("polindromdur");
        }else{
            System.out.println("polindrom degildir");

        }


    }
}
