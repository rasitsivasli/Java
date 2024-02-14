package Privat.DE03_04OperatorsAndMathClass.AritmeticOperator.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*Task->
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * MainClass : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */

        Scanner scan= new Scanner(System.in);

            System.out.print("Uc basamakli bir sayi giriniz : ");

            int sayi = scan.nextInt();
        System.out.println(" Girdiginiz sayinin birler basamagi : "+ (sayi%10));
        System.out.println(" Girdiginiz sayinin onlar basamagi : "+ ((sayi%100)/10));
        System.out.println(" Girdiginiz sayinin yüzler basamagi : "+ (sayi/100));



    }
}
