package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz


    */

       saatKacSaniye();



    }

    private static void saatKacSaniye() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("saat giriniz : ");
        int saat = scanner.nextInt();

        saat=saat*3600;
        System.out.println(saat+" saniyedir");

    }


}
