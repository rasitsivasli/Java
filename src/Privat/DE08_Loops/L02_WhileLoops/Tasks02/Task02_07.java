package Privat.DE08_Loops.L02_WhileLoops.Tasks02;

import java.util.SortedMap;

public class Task02_07 {
    public static void main(String[] args) {
        // rast gele 10 adet sayı üretiniz [1,100], bu sayılardan çift olanların sayısını bulunuz

        int n = 0;
        String cift = "";
        System.out.print("Randomdan üretilen sayilar : ");
        while (n < 10) {
            int random = (int) (Math.random() * 100);
            System.out.print(random + ",");
            if (random % 2 == 0) {
                cift += random + ",";

            }
            n++;

        }
        System.out.println();
        System.out.println("cift = " + cift);
    }
}
