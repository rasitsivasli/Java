package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task05_BuradanBasla {
    public static void main(String[] args) {
          /*
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        şekli print eden code create ediniz
         */
        System.out.print("kac satir yazdirmak istiyorsunuz ? ");
        Scanner scanner = new Scanner(System.in);
        int satirSayisi=scanner.nextInt();
        System.out.print("kac kare yanyana yazdirmak istiyorsunuz ? ");
        int kareSayisi=scanner.nextInt();


        for (int i = 0; i < satirSayisi; i++) {

            for (int j = 0; j < kareSayisi; j++) {
                System.out.print("# ");// kare seklini olusturan kisim yanyana yazdirir..
            }
            System.out.println();// bir satir bittiginde alt satira gecmek icik
        }


    }
}
