package Privat.DE08_Loops.L03_DoWhileLoops.Tasks;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
  /*
  Task-> Girilen sayıyı 0 olmadıgı sürece girilen sayıların toplamını print eden code create ediniz.
   */

        // Sıfırı bulana kadar, rastgele 0,10 arasında sayılar üretiniz,
        // ürettiğiniz sayıları ekrana yazdırınız
        int sayi;
        int total=0;
        do {
            sayi= (int) (Math.random()*10);
            System.out.print(sayi+",");
            total+=sayi;

        } while (sayi!=0);
        System.out.println();
        System.out.println("total = " + total);

    }
}
