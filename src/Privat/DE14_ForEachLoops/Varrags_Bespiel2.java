package Privat.DE14_ForEachLoops;

public class Varrags_Bespiel2 {
    public static void main(String[] args) {


        String[] arr = {"Hasan", "Ali", "Selim", "Andac", "Nedime"};
        stringeVarargs(arr, "Hasan", "Ali", "Selim", "Andac", "Nedime");

    }

    private static void stringeVarargs(String[] arr, String... isimler) {
        int uznluklarToplami = 0;
        for (String isim : isimler) {
            System.out.println(isim + "´in uzunlugu : " + isim.length());
            uznluklarToplami += isimler.length;

        }
        System.out.println("Tum kelimelerin uzunluklari toplami : " + uznluklarToplami);

        int enBuyuk = "Ali".length();
        for (String isim : arr) {
            if (isim.length() > enBuyuk) enBuyuk = isim.length();
        }
        System.out.println("enBuyuk = " + enBuyuk);
    }
}

