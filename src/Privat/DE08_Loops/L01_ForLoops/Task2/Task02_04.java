package Privat.DE08_Loops.L01_ForLoops.Task2;

import java.util.Scanner;

public class Task02_04 {
    public static void main(String[] args) {
        // 1 ila 100 arasında rastgele üretilen 10 adet sayının toplamını bulunuz

        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        System.out.print("üretilen sayilar : ");
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 100 + 1);
            System.out.print(random + ",");
            toplam +=random;
        }
        System.out.println();
        System.out.println("Randomdam alinan 10 adet sayinin toplami : "+ toplam);
    }
}
