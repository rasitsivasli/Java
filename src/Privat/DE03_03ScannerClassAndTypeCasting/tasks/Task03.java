package Privat.DE03_03ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * MainClass : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        System.out.print("Günlük uyku sürenizi giriniz : ");
        Scanner scan = new Scanner(System.in);
        int sure = scan.nextInt();
        System.out.println("Ayda : "+(sure*30/24.0)+"\nYilda : "+(sure*365/24.0)+"\n40 Yilda : "+(sure*365*40/24.0)+" "+"gününüz uykuda geciyor.");
    }
}
