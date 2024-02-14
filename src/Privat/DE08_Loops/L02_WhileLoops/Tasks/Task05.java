package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		Task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz
		Örnek : isim = ali kale
		cıktı : Baba Cocuk C D E
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Metin giriniz : ");
        String str = scanner.nextLine().toUpperCase();// her zaman büyük harflae olmasi icin
        int n = str.length();
        char ilkHarf = str.charAt(0);
        char sonHarf = str.charAt(n - 1);


        while (ilkHarf <= sonHarf) {


            System.out.print(ilkHarf + ",");
            ilkHarf++;
        }
        if (ilkHarf > sonHarf) {    // ilk harf büyük ise{

            while (ilkHarf >= sonHarf){
                System.out.println(ilkHarf+",");
                ilkHarf--;
            }

        }

    }
}
