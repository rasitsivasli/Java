package DE03_04OperatorsAndMathClass.ComparisonOperators.tasks;

import java.util.Scanner;

public class _16_ComparisonOperators_small_equal {

    public static void main(String[] args) {

        /* İki integer oluştur.
           İkisinin de değeri 13 olsun.
           Print kodunun içine, ilk int ikinci inte küçük veya eşittir yazın ve yazdırın.
           Console'da true yazısını görmelisiniz.
           Örnek:   15>=15  */

        // Kodu aşağıya yazınız.
        Scanner scan=new Scanner(System.in);

        System.out.println("1. sayiyi giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.println("1. sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.println(sayi1>=sayi2);


    }
}
