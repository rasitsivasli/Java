package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayı ? :");
        double number = scan.nextDouble();
        System.out.print("İkinci  sayı ? :");
        double number2 = scan.nextDouble();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.


        if (number > number2) {
            System.out.println("String 1 is equal to String 2");

        } else {
            System.out.println("String 1 is NOT equal to String 2");


        }
    }
}
