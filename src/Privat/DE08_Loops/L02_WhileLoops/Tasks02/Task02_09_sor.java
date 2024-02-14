package Privat.DE08_Loops.L02_WhileLoops.Tasks02;

public class Task02_09_sor {
    public static void main(String[] args) {
        /* Verilen n sayısına göre aşağıdaki şekli oluşturunuz
        n=5;
        * * * * *
        * * * *
        * * *
        * *
        *
         */

        int i = 5;// satir sayisi

        while (i >= 1) {

            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
        }
    }



