package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan password girmesini isteyin.
Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Password giriniz: ");

        int sayi = scan.nextInt();


        if (sayi % 5 == 0) {
            if (sayi % 10 == 0) {
                System.out.println("5 e bölünen cift sayi");
            } else {
                System.out.println("5 e bölünen tek sayi");
            }
        } else {
            System.out.println("Tekrar deneyin");
        }

    }
}
