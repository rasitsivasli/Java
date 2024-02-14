package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task05_selbst {

    public static void main(String[] args) {
		/*
		Task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz
		Örnek : isim = ali kale
		cıktı : Baba Cocuk C D E
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine().toUpperCase();//ASYA COOL tüm harflerin büyük olmasi icin

        char ilkHarf= name.charAt(0);
        char sonHarf= name.charAt(name.length()-1);

        while (ilkHarf<=sonHarf){

            System.out.print(ilkHarf+",");
            ilkHarf++;

        } while (ilkHarf>=sonHarf){

                System.out.print(ilkHarf+",");

                ilkHarf--;

        }

    }
}
