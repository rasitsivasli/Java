package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task16_AsalSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 /*
     Task-> Girilen sayının asal olmasını kontrol eden code create ediniz
     kendisi ve 1 dışında başka sayıya bölünmeyeb sayılara asal denir.
     2, 3, 5, 7, 11, 13, 17, 19, 23, 27
     * */
        System.out.print("Bir tamsayı giriniz: ");
        int sayi = scanner.nextInt();
        int sayac = 0;

            for (int i = 1; i <= sayi; i++) {

                if (sayi % i == 0) {
                    sayac++;
                }
            }
        if (sayac == 2) {
            System.out.println("asaldir");
        } else {
            System.out.println("asal degildir");
        }

        // 2.cozum
        System.out.println("--------");
        boolean flag = true;

        for (int i = 2; i <sayi; i++) {
            if (sayi%i==0){
                System.out.println("Asal degildir.");
                flag=false;
                break;
            }

        }if (flag){
            System.out.println("Asaldir");
        }
    }
}
