package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        Task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde ise
        "javaTAR" print eden code create ediniz. (javaTar yaz ve çık)
        do-while lopp
         */
        Scanner scanner = new Scanner(System.in);
        String ch;


        do {
            System.out.print("Bir karakter giriniz : ");
            ch = scanner.nextLine();
            if (ch.equals("x")) {
                System.out.println("javaTar");break;
            } else {
                System.out.println("JavaCan");
            }
        }while (true);


    }
}

