package Privat.DE08_Loops.L01_ForLoops.Task1;

public class Task31 {

    public static void main(String[] args) {
        /*
            1
            1  2
            1  2  3
            1  2  3  4.

         */

        for (int i = 1; i <=4; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();// bir alt satira inmek icin
        }

    }
}
