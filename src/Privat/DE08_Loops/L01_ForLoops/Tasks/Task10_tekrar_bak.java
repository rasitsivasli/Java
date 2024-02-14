package Privat.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task10_tekrar_bak {

    public static void main(String[] args) {
        /* Task ->
        girilen bir ifadenin istenen harf sayısını(harfin kaç adet olduğunu) print eden code create ediniz
        for kullanarak yapın

        input : selam javaCAN'lar
        output : a sayısı :3
         */


        Scanner scanner = new Scanner(System.in);
        System.out.print("bir metin  giriniz : ");
        String str = scanner.nextLine();
        int uz = str.length();
        int sayac = 0;

        for (int i = 0; i <uz; i++) {

            if (Character.isDigit('a')) {
                sayac ++;
            }
        }
        System.out.println(sayac);
    }
}
