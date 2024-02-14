package Privat.DE03_04OperatorsAndMathClass.ComparisonOperators.tasks;

import java.util.Scanner;

public class _15_ComparisonOperators_smaller {

    public static void main(String[] args) {

    /*    İki ayrı integer oluşturun.
            İlk integerin değeri 17,
            İkinci integerin değeri 20 olsun.
            Print kodunun içine, ilk int ikinci int'ten küçüktür yazın.(<,> simgeleri ile)
            Console'da true yazısını görmelisiniz. */

        // Kodu buraya yazınız.
        Scanner scan = new Scanner(System.in);

        System.out.println("1. sayiyi giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.println("1. sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.println(sayi1<sayi2);
    }
}
