package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task01_sayilarinToplami {
    public static void main(String[] args) {
        // Task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz
        Scanner scanner = new Scanner(System.in);

        int toplam=0;
        int counter=0;

        while (toplam<=333){
            System.out.print("Lütfen bir sayi giriniz : ");
            int sayi= scanner.nextInt();
            toplam+=sayi;
            counter++;
        }
        System.out.println("Girilen sayi adedi : "+counter);
        System.out.println("Girilen sayilarin toplami : "+ toplam);









    }
}
