package Privat.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        //  Task->  0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
        //Not: 0 ve 100 dahildir.

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        for (int i = 0; i <= 100; i+=2) {
            System.out.print(i+",");
            toplam ++;
        }
        System.out.println("toplam sayi adedi = " + toplam);




//        2. Method
//        for (int i = 0; i <= 100; i++) {
//            int random = (int) (Math.random() * 100 + 1);
//
//            if (random % 2 == 0) {
//                 // toplam cift sayi adedini de bul..
//                toplam = toplam+1;
//                System.out.print(random+",");
//            }
//        }
//        System.out.println("toplam = " + toplam);

    }
}

