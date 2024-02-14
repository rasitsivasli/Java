package CodeChallenges.Boz.IfElse;

import java.util.Scanner;

public class SayilarinToplami {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degeri olarak sayilar alin
        // sinirlar dahil olmak üzre sayilari yazdirin
        // Bitis degeri bslangic degerinden kücükse uyari olsun


        Scanner scanner = new Scanner(System.in);
        System.out.println("Baslangic degerini giriniz : ");
        System.out.print("first : ");
        int first = scanner.nextInt();
        System.out.print("end: ");
        int end = scanner.nextInt();
        int toplam = 0;
        if (first >= end) {
            System.out.println("yanlis degerler girdiniz");
        } else {

            for (int i = first; i <= end; i++) {
                 toplam+=i;

            }
        }System.out.print(toplam);
    }
}
