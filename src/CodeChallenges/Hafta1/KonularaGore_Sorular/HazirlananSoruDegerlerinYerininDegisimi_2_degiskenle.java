package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class HazirlananSoruDegerlerinYerininDegisimi_2_degiskenle {
//    kullanıcıdan iki sayıyı alın, ardından bu iki sayının değerlerini
//    üçüncü bir değişken kullanmadan değiştirin ve sonuçlarını ekrana yazdırın.
public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    System.out.print("Bir sayi giriniz : ");
    int sayi1 = scanner.nextInt();
    System.out.print("Ikinci sayiyi giriniz : ");
    int sayi2 = scanner.nextInt();

    sayi2 = sayi1+sayi2;
    sayi1 = sayi2 -sayi1;
    sayi2 = sayi2-sayi1;

    System.out.println("sayi1 = " + sayi1);
    System.out.println("sayi2 = " + sayi2);
}

}
