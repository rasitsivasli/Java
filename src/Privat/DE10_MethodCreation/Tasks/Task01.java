package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        //Task-> girilen iki sayının eşitliğini control eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int num1 = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        int num2 = input.nextInt();

        if (esitMi(num1, num2)) System.out.println("esittir");
        else System.out.println("esit degildir..");

        // 1. girilen sayi 2. girilen sayidan büyük mü..
        if (buyukMu(num1, num2)) System.out.println("buyuktur");
        else System.out.println("buyuk degildir..");

        // toplamlari nedir..
        System.out.println(toplam(num1,num2));
        int toplam=0;

    }//main sonu

    private static boolean buyukMu(int num1, int num2) {
        return num1 > num2;
    }

    static boolean esitMi(int num1, int num2) {
        return num1 == num2;
    }
    private static int toplam(int num1, int num2) {
        return  num1 + num2;
    }

}//class sonu
