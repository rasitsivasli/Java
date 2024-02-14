package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 Task->girilen bu "asda1231231!!ß# +-" metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

        Scanner scanner = new Scanner(System.in);
        //System.out.print("Lütfen metin giriniz: ");
        String str = "asda1231231!!ß# +-";
        int n = 0;
        int countHarf = 0;
        int countRakam = 0;
        int countOzel = 0;

        while (n < str.length() - 1) {
            char ch = str.charAt(n);

            if (Character.isLetter(ch)) {
                countHarf++;

            } else if (Character.isDigit(ch)) {
                countRakam++;

            } else {
                countOzel++;

            }

            n++;
        }
        System.out.println("Harf sayisi : " + countHarf);
        System.out.println("Rakam sayisi : " + countRakam);
        System.out.println("Ozel karakter sayisi : " + countOzel);
    }

}
