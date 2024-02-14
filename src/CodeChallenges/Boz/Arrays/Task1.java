package CodeChallenges.Boz.Arrays;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        String [] sinifListesi=new String[5];
        doldur(sinifListesi);

    }

    private static void doldur(String[] sinifListesi) {

        String[] isimler= {"ali","ayse","veli","isa","semsi"};
        sinifListesi=isimler;
        System.out.println("sinifListesi = " + Arrays.toString(sinifListesi));
        System.out.println("sinifListesi = " + Arrays.toString(sinifListesi));
        System.out.println("sinifListesi = " + Arrays.toString(sinifListesi));
    }
}
