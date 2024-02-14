package Privat.DE03_03ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task10 {
    /*
    Task->
    Write a Java program to convert temperature from Fahrenheit to Celsius degree.
    formula :  c = (f-32)*5/9
     */
    public static void main(String[] args) {
        System.out.print("Sicakligi F degerinde giriniz : ");
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();

        double c = (double) ((f - 32) * 5) /9 ;
        System.out.println("Sicaklik C cinsinden : "+ c );


    }


}
