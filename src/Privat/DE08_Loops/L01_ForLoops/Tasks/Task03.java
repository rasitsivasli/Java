package Privat.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayi  giriniz : ");
        int sayi = scanner.nextInt();
        int faktoryel = 1;

        for (int i = 1; i <= sayi; i++) {

            faktoryel *=i;// faktoryel = faktoryel*i ayni anlama geliyaor

        }
        System.out.println("sayinin faktöriyeli = "+ faktoryel);


    }
}
