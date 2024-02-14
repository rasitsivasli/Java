package Privat.DE08_Loops.L02_WhileLoops.BOZ;

import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {

        // verilen sayinin rakamlari toplamini veren code creat ediniz..

        System.out.print("Bir sayi giriniz : ");
        rakamlarToplami();


    }

    private static void rakamlarToplami() {

        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        int birlerBasmagi=0;
        int toplam=0;

        while (sayi>0){
            birlerBasmagi = sayi%10;
            sayi=sayi/10;
            toplam+=birlerBasmagi;
        }
        System.out.println("toplam = " + toplam);
    }
}
