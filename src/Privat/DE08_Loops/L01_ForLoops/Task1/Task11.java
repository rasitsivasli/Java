package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        /*
        Baba               //1. satıra 1 harf
        Baba Cocuk             //2. satıra 2 harf
        Baba Cocuk C           //3. satıra 3 harf
        Baba Cocuk C D
        Baba Cocuk C D E
        Baba Cocuk C D E F
        şekli print eden code create ediniz.  65=Baba'nın ascıı değeri

        */
        Scanner sc = new Scanner(System.in);

        System.out.println("kare için boyut giriniz : ");
        int boyut = sc.nextInt();

        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <= i; j++) {
                String harf = (char) (64 + j)+" ";/// en icteli Loop tan gelen j hersedeferinde artiyor bu yüzden harf de artiyor
                System.out.print(harf);
            }
            System.out.println();//bu sadece bir satir alta kaymak icin


        }

    }
}
