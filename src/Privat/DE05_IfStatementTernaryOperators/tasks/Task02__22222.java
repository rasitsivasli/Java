package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task02__22222 {

    public static void main(String[] args) {
		/*
		Task->
		Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
		yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.
		 
		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("1. kenar uzunlugunu giriniz  : ");
        int k1 = scan.nextInt();

        System.out.print("2. kenar uzunlugunu giriniz  : ");
        int k2 = scan.nextInt();

        System.out.print("3. kenar uzunlugunu giriniz  : ");
        int k3 = scan.nextInt();

        if (k1==k2 && k2==k3 ) System.out.println("Eskenar ücgenir ");
        else if ((k1==k2 || k2==k3 || k1==k3)  ) System.out.println("ikizkenar ücgendir ");
        else System.out.println("Cesitkenar ücgendir ");

        // 2. cozum


        String durum= k1==k2 && k2==k3 ? "Eskenar ücgenir ": (k1==k2 || k2==k3 || k1==k3)? "ikizkenar ücgendir ":"Cesitkenar ücgendir ";

        System.out.println("durum = " + durum);
    }


}
