package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class _01_if_statement {

    public static void main(String[] args) {

    /*  İki tane int oluşturun. Birinci (1.) int 35. İkinci (2.) int 23.
        Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
        Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın.  */

        //Kodu aşağıya yazınız.
        Scanner scan = new Scanner(System.in);

        int i1 = (int) (Math.random()*10+10);
        System.out.println("i1 = " + i1);

        int i2 = (int) (Math.random()*10+10);
        System.out.println("i2 = " + i2);

        if (i1>i2) {
            System.out.println("int 1 is greater than 2");
        }

        else {
            System.out.println("int 1 is smaller than 2");

        }
    }
}
