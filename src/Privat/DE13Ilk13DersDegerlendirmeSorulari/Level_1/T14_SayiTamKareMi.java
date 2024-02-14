package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class T14_SayiTamKareMi {
    /* karekökü tamsayı olana sayılara Tam kare denir,
    verilen sayının tam kare olup olmadığını bulan bir code yazınız
    input  : 50  , output : 50 "Tam kare değildir"
    input  : 36  , output : 36 "Tam karedir"

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num = scanner.nextInt();
        if (Math.sqrt(num)==(int) Math.sqrt(num)) System.out.println("Tam karedir");
        else System.out.println("Tam kare degildir");

    }
}
