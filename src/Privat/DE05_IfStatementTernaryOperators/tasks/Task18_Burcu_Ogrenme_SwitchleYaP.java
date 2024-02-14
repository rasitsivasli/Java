package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task18_Burcu_Ogrenme_SwitchleYaP {
    /* Koç Burcu : 21 Mart - 20 Nisan
       Boğa Burcu : 21 Nisan - 21 Mayıs
       İkizler Burcu : 22 Mayıs - 22 Haziran
       Yengeç Burcu : 23 Haziran - 22 Temmuz
       Aslan Burcu : 23 Temmuz - 22 Ağustos
       Başak Burcu : 23 Ağustos - 22 Eylül
       Terazi Burcu : 23 Eylül - 22 Ekim
       Akrep Burcu : 23 Ekim - 21 Kasım
       Yay Burcu : 22 Kasım - 21 Aralık
       Oğlak Burcu : 22 Aralık - 21 Ocak
       Kova Burcu : 22 Ocak - 19 Şubat
       Balık Burcu : 20 Şubat - 20 Mart

       switch-case kullanmadan yapınız. */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ayin kacinda dogdunuz: ");
        int gun = scan.nextInt();

        System.out.print("Kacinci ayda dogdunuz: ");
        int ay = scan.nextInt();

        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) System.out.println("Koç Burcu");
        if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) System.out.println("Boga Burcu");
        if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) System.out.println("Ikizler Burcu");
        if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) System.out.println("Yengec Burcu");
        if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) System.out.println("Aslan Burcu");
        if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) System.out.println("Basak Burcu");
        if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) System.out.println("Terazi Burcu");
        if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) System.out.println("Akrep Burcu");
        if ((ay ==11 && gun >= 22) || (ay == 12 && gun <= 21)) System.out.println("Yas Burcu");
        if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)) System.out.println("Oglak Burcu");
        if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) System.out.println("Kova Burcu");
        if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) System.out.println("Balik Burcu");



    }
}
