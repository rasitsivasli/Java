package CodeChallenges.Hafta1;

import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {
 /*
   girilen iki tam sayının toplamının karesi,farkının karekökü ve ortalamasını, print eden code create ediniz.
   */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi1 i negatif giriniz : ");
        int sayi1 = scanner.nextInt();
        System.out.println("Sayi2 i giriniz : ");
        int sayi2 = scanner.nextInt();
        int toplam = sayi1 + sayi2;
        double toplaminKaresi = Math.pow(toplam, 2);
        int fark = sayi1 - sayi2;
        double toplaminKarekoku =  (Math.sqrt(Math.abs(fark)));
        double ort = (double) (sayi1 + sayi2) / 2;

        System.out.println("toplamin karesi : " + toplaminKaresi);
        System.out.println("farkinin karekökü : " + toplaminKarekoku);
        System.out.println("sonuc : " + ort);

    }
}
