package CodeChallenges.Hafta6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru1_direktenAlinarakBirDiziOlusturma {
    public static void main(String[] args) {

        System.out.println("Bir dizi olusturmak iciN 5 adet sayi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[5];
        for (int i = 0; i < 5; i++) {
            dizi[i] = scanner.nextInt();
        }
        System.out.println("dizi = " + Arrays.toString(dizi));

        int [] c,d;
        c = new int[5];
        int [] dizi2 = {1,2,3,6};

    }

}
