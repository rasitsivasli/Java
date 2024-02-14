package Privat.DE03_04OperatorsAndMathClass.ComparisonOperators.tasks;

import java.util.Scanner;

public class _14_ComparisonOperators_bigger {

    public static void main(String[] args) {

     /*   Bir integer oluşturun ve değeri 13 olsun.
                Başka bir integer daha oluşturun ve değeri 10 olsun.
                Print kodunun içine Ilk int ,ikinci int'ten büyüktür yazın. (>,< simgeleri ile)
                Console' da 'true' yazısını görmelisiniz.        */

        //Kodu aşağıya yazınız.

        System.out.print("Birinci sayiyi giriniz : ");
        Scanner scan = new Scanner(System.in);
        int sayi1 = scan.nextInt();

        System.out.print("Ikinci sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.println(sayi1 == sayi2);
        System.out.println(sayi1==sayi2);
        System.out.println(sayi1<=sayi2);


    }
}
