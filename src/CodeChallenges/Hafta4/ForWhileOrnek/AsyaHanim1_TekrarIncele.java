package CodeChallenges.Hafta4.ForWhileOrnek;

import java.util.Scanner;

public class AsyaHanim1_TekrarIncele {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
        //1453 ---1+4+5+3= 13


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz ");
        String str = scanner.next();

        int sonIndex= str.length()-1;
        int n=0;
        int toplam = 0 ;

        while (n<=sonIndex){

            String rakam = str.substring(n,n+1);
            int rak= Integer.parseInt(rakam);
            toplam+=rak;
            n++;
        }
        System.out.println("toplam = " + toplam);

        /*  2. cozüm

    System.out.println("lutfen sayi  giriniz: ");
        int sayi = input.nextInt();
        int toplam =0;
        int i=1;
        while (i<=sayi){ // sayiyi 1345 alalim mesela
            int rakam =sayi%10;
            sayi = sayi/10;
            toplam =toplam+rakam;
            i++;
        }
        System.out.println(toplam);
*/
    }
}
