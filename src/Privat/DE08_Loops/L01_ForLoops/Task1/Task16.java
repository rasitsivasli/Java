package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task16 {

    /*
     Task-> Girilen sayının asal olmasını kontrol eden code create ediniz
     kendisi ve 1 dışında başka sayıya bölünmeyeb sayılara asal denir.
     2, 3, 5, 7, 11, 13, 17, 19, 23, 27
     * */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi <= 1) {
            System.out.println("Asal değil");
            return;
        }

        boolean asal = true;

        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                asal = false;
                break;
            }
        }

        if (asal) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }


    }
}

