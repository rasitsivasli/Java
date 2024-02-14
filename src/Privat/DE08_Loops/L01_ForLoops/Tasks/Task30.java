package Privat.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        // Task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerleri icin 2 pozitif tamsayi giriniz");

        int baslangic = scan.nextInt();
        int bitis = scan.nextInt();
        int toplam = 0;

        for (int i = baslangic + 1; i < bitis; i++) {
                 toplam = toplam+i;
        }
        System.out.println("toplam = " + toplam);
    }
}
