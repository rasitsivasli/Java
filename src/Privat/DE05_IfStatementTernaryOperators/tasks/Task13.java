package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("1.Sayiyi giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.println("2.Sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.print("Islem türünü seciniz (+,-,*,/ :) ") ;
        char islem = scan.next().charAt(0);

        System.out.println(islem=='+'? sayi1+sayi2 : ((islem=='-'? sayi1-sayi2 :(islem=='*'? sayi1*sayi2: sayi1*1.0/sayi2)  )));

    }
}
