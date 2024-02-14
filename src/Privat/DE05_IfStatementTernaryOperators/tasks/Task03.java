package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		/*
		Task->
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bölunuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bölunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Yil giriniz  : ");
        int yil = scan.nextInt();
        boolean sonuc = yil%1000==0;

        if (sonuc){
            System.out.println("Milenyum");}

            else if (yil%100==0) {
            System.out.println("Yüzyil");
            }
            else if (yil%10==0)
        {
            System.out.println("Onyil");}
            else System.out.println("Hicbiri");









    }
}

	

