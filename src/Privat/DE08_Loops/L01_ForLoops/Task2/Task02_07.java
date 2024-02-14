package Privat.DE08_Loops.L01_ForLoops.Task2;

import java.util.Scanner;

public class Task02_07 {
    public static void main(String[] args) {
        // 1 ila 100 arasında rastgele üretilen 10000 adet int sayıdan
        // % kaçı tek sayıdır

        Scanner scanner = new Scanner(System.in);
        int counter =0 ;// sayac demek
        System.out.print("üretilen sayilar : ");
        for (int i = 0; i < 10000; i++) {
            int random = (int) (Math.random() * 100 + 1);
            System.out.print(random + ",");// üretilen sayilari ciktida görmek icin yaptik..

            if (random % 2 == 1) {
                counter++;

            }
        }
        System.out.println();
        System.out.print("tek sayilar % si: " + counter*1.0/100);

    }
}
