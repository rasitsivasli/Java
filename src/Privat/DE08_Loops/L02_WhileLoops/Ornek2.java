package Privat.DE08_Loops.L02_WhileLoops;

public class Ornek2 {
    public static void main(String[] args) {

        ///  sifiri bulana kadar, rastlegele 0 ile 10 arasinda sayi üretin
//        int sayi;
//
//        do {
//            sayi = (int) (Math.random() * 11);
//            System.out.print(sayi + " ");
//        } while (sayi != 0);
//        System.out.println();
//        System.out.println("------");
        // 2.yol


        for (int i = 1; i <Integer.MAX_VALUE; i++) {
            int random = (int) (Math.random() * 11);
            System.out.println("random = " + random);
            if (random==0){
                System.out.println(random);break;
            }

        }

    }
}
