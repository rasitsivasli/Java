package Privat.DE07_StringManuplation.tasks02;

import java.util.Scanner;

public class Task02_08 {
    public static void main(String[] args) {

        /*  TASK :
				StringMethods:
				girilen  bir strngin ikinci yarisini print eden code create ediniz
				uzunluk tek ise 2 ye bölünemez yazdırın
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista

				*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Herhangi bir kelime giriniz : ");
        String str = scanner.nextLine();

        String yeniKelime= str.substring(str.length()/2);

        if (str.length()%2==0){
            System.out.println("yeniKelime = " + yeniKelime);

        }else System.out.println("uzunluk tek, 2 ye bölünemez.");




    }
}







