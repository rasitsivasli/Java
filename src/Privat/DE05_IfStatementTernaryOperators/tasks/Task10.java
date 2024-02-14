package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /* Task->
         Kullanicidan 100 uzerinden notunu isteyin.
         Not’u harf sistemine cevirip yazdirin.
         50’den kucukse “D”,->1,2,3..49
         =50  <60 arasi “C”,->50,51,52,..59
         =60  <80 arasi “Cocuk”,->60,61,62,63..79
         =80’nin uzerinde ise “Baba”->80,81..100
         */



        Scanner scan = new Scanner(System.in);
        System.out.println("agam notunu  gir : ");
        int not = scan.nextInt();

        if (not <50) System.out.println("D");
        else if (not <60) System.out.println("C");
        else if (not <80) System.out.println("Cocuk");
        else if (not <=100) System.out.println("Baba");








    }
}
