package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task04_44444 {

    public static void main(String[] args) {
		/*Task->
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf"
		 Bu character kucuk harf ise "Kucuk Harf"
		 Bu character harf degil ise "Harf Degil"  print eden code create ediniz.
		*/


		/*
		 Logical Operator (Mantik Islemleri)
		 1) And Islemi : Sembolu & veya && dir.&& sembolu daha hizli calisir.Bu yuzden genellikle && kullaniriz
		 						true && true = true
		 						true && false = false
		 						false && true = false
		 						false && false = false
		 2)Or Islemi : Sembolu || dir
		 						true || false = true
		 						true || true = true
		 						false || true = true
		 						false || false = false
		 3)Not Islemi : Sembolu !'dir
		 						!true = false
		 						!false = true
		 						
		 						
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Character giriniz  : ");
        char ch = scan.next().charAt(0);

        if (Character.isLetter(ch)) {
            if (Character.isUpperCase(ch)) {
                System.out.println("Buyuk Harf");
            } else {
                System.out.println("Kucuk Harf");
            }
        } else {
            System.out.println("Harf Degil");
        }
    }
}



