package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task33_MukemmelSayi_HocaninCozumunuTekrarBakalim {
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)



        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int toplam = 0;
        boolean mukemmelSayiMi = false;

        for (int i = 1; i < sayi; i++) {

            if (sayi % i == 0) {
                toplam += i;

                if (toplam == sayi) {
                    mukemmelSayiMi = true;
                    System.out.println("mükemmel sayidir");
                }
            }
        }
        if (!mukemmelSayiMi) {
            System.out.println("mükemmel sayi degildir");
        }



    }


}
