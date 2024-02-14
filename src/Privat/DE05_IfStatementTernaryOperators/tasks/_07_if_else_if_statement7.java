package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class _07_if_else_if_statement7 {

    public static void main(String[] args) {

 /*  Altta int number klavyeden girilerek oluşturulmuştur.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/

        //Kodu aşağıya yazınız.

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("number is a EVEN number");
        } else {
            System.out.println("number is a ODD number");


        }
    }
}

