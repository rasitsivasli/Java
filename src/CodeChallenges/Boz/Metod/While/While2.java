package CodeChallenges.Boz.Metod.While;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
//     Alinan bir sayidan 0 kadar olan sayilarin toplami

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        System.out.println("toplam(sayi) = " + toplam(sayi));


    }

    private static int toplam(int sayi) {
        int toplam=0;
        while (sayi>0){
            toplam+=sayi;

            sayi--;
        }
        return toplam;
    }
}
