package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task02_kendinCoz {
    public static void main(String[] args) {
        /* Task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :
        örnekler
        "ece"
        "ada"
        "ey edip adanada pide ye"

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("bir metin  giriniz : ");
        String str = sc.nextLine();
        int uzunluk = str.length();
        int sonIndex= str.length()-1;

        boolean polindromdur = true;

        for (int i = 0; i <uzunluk ; i++) {

            if (str.charAt(i)!=str.charAt(sonIndex-i)){
                polindromdur=false;
                break;

            }

        }if (polindromdur){
            System.out.println(polindromdur);
        }else System.out.println("polidrom degildir");






    }
}