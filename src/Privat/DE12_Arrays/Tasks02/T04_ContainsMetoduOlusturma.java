package Privat.DE12_Arrays.Tasks02;

import java.util.Scanner;

public class T04_ContainsMetoduOlusturma {
    // Dizi için contains metodu yazınız, geri dönüş tipi boolean olsun
    public static void main(String[] args) {

        int[] arr = {21, 27, 46, 79, 44, 2, 1, 80};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hangi sayinin dizide olup olmadigini kontrol etmek istiyorsunuz : ");
        int sayi = scanner.nextInt();

        boolean sonuc =  contains(arr, sayi);
        System.out.println("sonuc = " + sonuc);
    }

    private static boolean contains(int[] arr, int sayi) {
        boolean sonuc = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sayi) {
                sonuc = true;
            }
        }
        return sonuc;
    }


}
