package Privat.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task -> girilen 10 sayının [10 ile 20] arası hariç diğerlerinin
        toplamının print eden code create ediniz
        örnek , sayılar 13,5,20,7,10,12,56,45,15,12 olsun
        output : toplam = 5+7+56+45
         */

        Scanner scanner = new Scanner(System.in);

        int toplam = 0;


        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 100);
            System.out.println("random = " + random);

            if (random < 10 || random > 20) {
                toplam += random;   // toplam = toplam+random ayni anlamda
                System.out.println("toplam = " + toplam);
            }
        }
        System.out.println("toplamSon = " + toplam);
    }
}
