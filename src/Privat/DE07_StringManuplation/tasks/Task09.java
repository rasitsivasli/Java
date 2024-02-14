package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista

		 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Herhangi bir kelime giriniz : ");
        String str = scanner.nextLine();

        if (str.length() % 2 == 0) {
            System.out.println(str.substring(0, str.length() / 2));

        } else System.out.println("Lütfen harf adedi cift olan bir syi giriniz");

    }
}
