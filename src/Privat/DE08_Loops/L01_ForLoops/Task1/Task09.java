package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
           /*
        Task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */
        Scanner sc = new Scanner(System.in);

        System.out.println("kare için boyut giriniz : ");
        int boyut = sc.nextInt();
        String yildiz = "";
        for (int i = 1; i <= boyut; i++) {

            for (int j = 1; j <= i; j++) {
                yildiz = "*" + " ";
                System.out.print(yildiz);
            }
            System.out.println();

        }


    }


}

