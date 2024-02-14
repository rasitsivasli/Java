package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task21_sor {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 8;
        String yildiz = "";


        for (int i = 0; i <= n; i++) {// bu forun görevi n adet satir olusturmak icin olustu
            for (int j = 1; j <= (n - i); j++) {// bu forun görevi n- satirSirasi (i) kadar bosluk koymak..
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {// bu forun görevi satirSirasi (i) kadar "*" veya "!" koymak..
                if (i == 1 || i == n || j == 1 || j == i)
                    System.out.print("* ");// bu ifin görevi "!" mi veya "*" konulacak onu belirliyor.
                else System.out.print("! ");
            }
            System.out.println();
        }


    }

}
































