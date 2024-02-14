package Privat.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task24_baskaYöntemleDene {

    public static void main(String[] args) {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */
        System.out.print("Metin giriniz : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i =str.length()-1 ; i>=0 ; i--) {

            System.out.print(str.charAt(i));
        }


    }

}
