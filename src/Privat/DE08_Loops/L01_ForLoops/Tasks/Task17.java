package Privat.DE08_Loops.L01_ForLoops.Tasks;

public class Task17 {

    public static void main(String[] args) {

        /*
        Task->  0 ile 100 arasındaki hem 5'e, hem de 4'e aynı anda tam bölünebilen
        sayıları print eden code create edinz.

         */
        for (int i = 0; i <= 100; i += 20) {
            System.out.print(i + ",");

        }
//////////2-yol

        for (int i = 0; i <= 100; i++) {

            if (i % 4 == 0 && i % 5 == 0) {
                System.out.print(i + ",");
            }


        }
    }
}
