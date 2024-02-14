package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        /*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir karakter giriniz  : ");

        char ch = scan.next().charAt(0);

        if (Character.isLetter(ch)) System.out.println("Girilen bir harftir");
        else System.out.println("Girilen bir harf degildir");


    }
}
