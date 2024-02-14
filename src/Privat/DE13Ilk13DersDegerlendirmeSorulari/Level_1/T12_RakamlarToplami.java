package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class T12_RakamlarToplami {
    /*
    klavyeden 3 basamaklı bir sayı giriliyor, rakamları toplamını bulunuz
    input : 341
    output: 8
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num = scanner.nextInt();
        rakamlarToplamiBrinciYol(num);
        rakamlarToplamiIkinciYol(num);
    }

    private static void rakamlarToplamiIkinciYol(int num) {
        String str = ""+num;
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            toplam += Integer.parseInt(""+str.charAt(i));

        }
        System.out.println(toplam);
    }

    private static void rakamlarToplamiBrinciYol(int num) {
        int birlerBasamagi = 0;
        int i = 0;
        while (num > 0) {
            birlerBasamagi += num % 10;
            num = num / 10;
            i++;
        }
        System.out.println(birlerBasamagi);
    }

}
