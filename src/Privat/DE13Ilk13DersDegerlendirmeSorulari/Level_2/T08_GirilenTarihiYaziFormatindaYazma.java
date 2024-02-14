package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T08_GirilenTarihiYaziFormatindaYazma {
 /*  String str = "03/01/2022 şeklinde bir tarih veriliyor
    bunu 05 / Kasım / 2023 şeklinde yazan bir metot yazınız
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("GG/AY/YIL formatinda tarih giriniz : ");
        String str = scanner.nextLine();

        String yeniStr = str.substring(str.indexOf("/")+1, str.lastIndexOf("/"));
        System.out.println("yeniStr = " + yeniStr);
        List<String> list = new ArrayList<>(Arrays.asList("Ocak", "Subat", "Mart", "Nisan",
                "Mayis", "Haziran", "Temmuz", "Agustos", "Eylul", "Ekim", "Kasim", "Aralik"));

        switch (yeniStr) {
            case "01":
                System.out.println(str.substring(0, 2) + "/" + list.get(Integer.parseInt(yeniStr)-1) + "/" + str.substring(str.length()-4));break;
            case "02":
                System.out.println(str.substring(0, 2) + "/" + list.get(Integer.parseInt(yeniStr)-1) + "/" + str.substring(str.length()-4));break;
            case "03":
                System.out.println(str.substring(0, 2) + "/" + list.get(Integer.parseInt(yeniStr)-1) + "/" + str.substring(str.length()-4));break;
            case "04":
                System.out.println(str.substring(0, 2) + "/" + list.get(Integer.parseInt(yeniStr)-1) + "/" + str.substring(str.length()-4));break;
            case "05":
                System.out.println(str.substring(0, 2) + "/" + list.get(Integer.parseInt(yeniStr)-1) + "/" + str.substring(str.length()-4));break;
            case "06":
                System.out.println(str.substring(0, 2) + "/" + list.get(Integer.parseInt(yeniStr)-1) + "/" + str.substring(str.length()-4));break;
            case "07":
                System.out.println(str.substring(0, 2) + "/" + list.get(Integer.parseInt(yeniStr)-1) + "/" + str.substring(str.length()-4));break;
            case "08":
                System.out.println(str.substring(0, 2) + "/" + list.get(Integer.parseInt(yeniStr)-1) + "/" + str.substring(str.length()-4));break;
            case "09":
                System.out.println(str.substring(0, 2) + "/" + list.get(Integer.parseInt(yeniStr)-1) + "/" + str.substring(str.length()-4));break;
            case "10":
                System.out.println(str.substring(0, 2) + "/" + list.get(Integer.parseInt(yeniStr)-1) + "/" + str.substring(str.length()-4));break;
            case "11":
                System.out.println(str.substring(0, 2) + "/" + list.get(Integer.parseInt(yeniStr)-1) + "/" + str.substring(str.length()-4));break;
            case "12":
                System.out.println(str.substring(0, 2) + "/" + list.get(Integer.parseInt(yeniStr)-1) + "/" + str.substring(str.length()-4));break;

        }

    }

}
