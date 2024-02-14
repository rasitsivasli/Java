package Privat.DE08_Loops.L01_ForLoops.Task1;

public class Task27_sor {
    public static void main(String[] args) {
            /* Ex-1: Asagidaki ciktiyi verecek kodu yaziniz
            1.
                        IT: 1
                          QA: 1
                          QA: 2
                          QA: 3
                          .....
                        IT: 2
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
                        IT: 3
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
         */

        for (int i = 1; i <=3; i++) {
            System.out.println("IT: "+i);
            for (int j = 1; j <=3 ; j++) {
                System.out.println("IT:QA "+j);

            }

            System.out.println(" .....");



        }


    }
}
