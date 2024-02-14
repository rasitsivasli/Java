package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class T12_RakamlarToplami {
    /* Klavyeden kaç basamklı olduğu belli olmayan int bir sayı veriliyor
    basamakları toplamını enaz 2 yöntem ile bulunuz ( her bir yöntem bir method olsun,
    metota parametre olarak sayı gider, rakam toplamı return edilir.)

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num = scanner.nextInt();
        System.out.println("rakamlarToplamiBrinciYol(num) = " + rakamlarToplamiBrinciYol(num));
        System.out.println("rakamlarToplamiIkinciYol(num) = " + rakamlarToplamiIkinciYol(num));
    }

    private static int rakamlarToplamiIkinciYol(int num) {
        String str = ""+num;
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            toplam += Integer.parseInt(""+str.charAt(i));

        }
        return toplam;
    }

    private static int rakamlarToplamiBrinciYol(int num) {
        int birlerBasamagi = 0;
        int i = 0;
        while (num > 0) {
            birlerBasamagi += num % 10;
            num = num / 10;
            i++;
        }
        return birlerBasamagi;
    }
}
