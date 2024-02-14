package Privat.DE03_03ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {


        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * MainClass : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *
         */

        System.out.print("Bir character giriniz : ");
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        System.out.println("Girilen character : "+ch+" ve karakterin ascii degeri : "+ (int) ch);



    }


}
