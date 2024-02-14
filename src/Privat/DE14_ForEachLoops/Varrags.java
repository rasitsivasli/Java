package Privat.DE14_ForEachLoops;

public class Varrags {
    public static void main(String[] args) {
        toplama(" Sayilarin toplami : ", 4, 6, 9, 14, 17);
        int[] dizi = {5, 4, 6, 9};
        toplama("dizi toplami : ",dizi);

    }

    private static void toplama(String str, int... sayilar) {
        System.out.println("uzunluk : " + sayilar.length);
        System.out.println("str = " + str);
        for (int sayi : sayilar) {
            System.out.print(sayi + " ");
        }
        System.out.println();
        System.out.println("--------");
    }
}
