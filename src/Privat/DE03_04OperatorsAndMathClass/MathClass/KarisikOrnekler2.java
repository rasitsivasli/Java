package Privat.DE03_04OperatorsAndMathClass.MathClass;

import java.util.Scanner;

public class KarisikOrnekler2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.print("3. Sayıyı giriniz: ");
        int sayi3 = scan.nextInt();


        int enb = Math.max(sayi3,Math.max(sayi1,sayi2));

        System.out.println(enb);

    }}
