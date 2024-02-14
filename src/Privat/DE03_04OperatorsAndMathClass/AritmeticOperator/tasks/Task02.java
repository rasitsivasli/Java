package Privat.DE03_04OperatorsAndMathClass.AritmeticOperator.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
		/*
		 Write sayi program that prints multiplication table for 1.
		 Do not use any loop.
		    1x1=1
		    1x2=2
			1x3=3
			1x4=4
			1x5=5
			1x6=6
			1x7=7	
			1x8=8
			1x9=9
			1x10=10
		 */
        System.out.print("Carpim tablosunu görmek istediginiz sayiyi giriniz : ");
        
        Scanner scan=new Scanner(System.in);
        int sayi = scan.nextByte();

        int b =1 , sonuc = 1;

        sonuc = sayi*(b++);
        System.out.println(sayi+"*1 = " + sonuc);


        sonuc = sayi*(b++);
        System.out.println(sayi+"*2 = " + sonuc);


        sonuc = sayi*(b++);
        System.out.println(sayi+"*3 = " + sonuc);

        sonuc = sayi*(b++);
        System.out.println(sayi+"*4 = " + sonuc);

        sonuc = sayi*(b++);
        System.out.println(sayi+"*5 = " + sonuc);


        sonuc = sayi*(b++);
        System.out.println(sayi+"*6 = " + sonuc);


        sonuc = sayi*(b++);
        System.out.println(sayi+"*7 = " + sonuc);

        sonuc = sayi*(b++);
        System.out.println(sayi+"*8 = " + sonuc);

        sonuc = sayi*(b++);
        System.out.println(sayi+"*9 = " + sonuc);

        sonuc = sayi*(b++);
        System.out.println(sayi+"*10 = " + sonuc);
    }
}
