package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task02_InerviewSorusu {
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
        int sonIndex= uzunluk-1;
        boolean polidromdur=true;

        for (int i = 0; i <uzunluk/2 ; i++) {
           if (str.charAt(i) != str.charAt(sonIndex-i)) {
               polidromdur=false;
               break;
            }
        }

        if (polidromdur) System.out.println("polidromdur");
        else System.out.println("polidrom değildir");


        // 2. yol   adada
        int sayac=0;
        for (int i = 0; i <uzunluk ; i++) {
             if (str.charAt(i) == str.charAt(sonIndex-i)) {
                 sayac++;
             }
        }

        if (sayac==uzunluk) System.out.println("poidromdur");
        else System.out.println("polidrom değildir");


        // 3.yol
        sayac=0;
        for (int i = 0; i <uzunluk ; i++) {
            if (str.charAt(i) != str.charAt(sonIndex-i)) {
                sayac++;
                break;
            }

        }

        if (sayac==0) System.out.println("poidromdur");
        else System.out.println("polidrom değildir");

        //4.yol


       polidromdur=true;

        for (int i = 0; i <uzunluk ; i++) {
            if (str.charAt(i) != str.charAt(sonIndex-i)) {
               polidromdur=false;
               break; // içinde bulunduğu loop dan çıkılmasını sağlar
            }

        }

        if (polidromdur) System.out.println("poidromdur");
        else System.out.println("polidrom değildir");





    }


}
