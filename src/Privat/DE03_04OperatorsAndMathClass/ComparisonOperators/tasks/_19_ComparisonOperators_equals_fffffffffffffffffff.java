package Privat.DE03_04OperatorsAndMathClass.ComparisonOperators.tasks;

import java.util.Scanner;

public class _19_ComparisonOperators_equals_fffffffffffffffffff {

    public static void main(String[] args) {

    /*    2 tane String oluşturun.
          String 1 "Apple" String 2 "Apple"
          İlk String'in değeri "Apple" , ikinci String'in değeri de "Apple"  olmalı.
        String1'in String2'ye eşit olduğunu doğrulayın.  */

        // Kodu aşağıya yazdırınız.
        Scanner scan=new Scanner(System.in);

        System.out.println("1. kelime giriniz : ");
        String a = scan.next();

        System.out.println("2. kelime giriniz : ");
        String b = scan.next();


        System.out.println(a==b);


    }
}
