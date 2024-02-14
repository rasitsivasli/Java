package Privat.DE03_04OperatorsAndMathClass.AritmeticOperator.tasks;

import java.util.Scanner;

public class Task09 {


    /*Task->
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);


        System.out.println("Ciflikte bulunan inek, koyun ve tavuk sayilarini giriniz ");

        System.out.println("Tavuk sayisi : ");
        int tavuk = scan.nextInt();
        int ta = tavuk*2 ;

        System.out.println("Inek sayisi : ");
        int inek = scan.nextInt();
        int ia = inek*4;

        System.out.println("Koyun sayisi : ");
        int koyun = scan.nextInt();
        int ka = koyun*4;

        System.out.println("Tavuk ayak sayisi : "+ta+"\nInek ayak sayisi : "+ia+"\nKoyun ayak sayisi : "+ka+"\nToplam ayak sayisi : "+(ta+ia+ka));


    }

}
