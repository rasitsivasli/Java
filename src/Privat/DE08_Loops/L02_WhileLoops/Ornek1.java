package Privat.DE08_Loops.L02_WhileLoops;

public class Ornek1 {
    public static void main(String[] args) {
        //  3 den 20 e kadar olan sayilari print ediniz

//// 1.yol mit While
        int i = 3;

        while (i <= 20) {
            System.out.println(i + " ");
            i++;
        }


        System.out.println("----------");

        //// 2.yol mit For

        for (int j = 3; j <= 20; j++) {
            System.out.println(i + " ");

        }
        System.out.println("----------");

        //// 3.yol mit  do-While

        i = 2;
        do {
            i++;

            System.out.println(i + " ");

        } while (i < 20);

        System.out.println("----------");

        //// 4.yol mit do-While

        i = 3;
        do {
            System.out.println(i + " ");
            i++;
        } while (i <= 20);
    }
}