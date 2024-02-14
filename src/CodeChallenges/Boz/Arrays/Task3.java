package CodeChallenges.Boz.Arrays;

import java.util.Arrays;

public class Task3 {// dizideki herbir variabel in uzunlugunu hesaplayan method.

    public static void main(String[] args) {
        String isimler= "ali ayse veli isa semsi";
        uzHesapla(isimler);

    }

    private static void uzHesapla(String isimler) {
        String[] uzHesapla = isimler.split(" ");
        System.out.println("uzHesapla = " + Arrays.toString(uzHesapla));
        uzHesapla[3]= String.valueOf(5);
        System.out.println("uzHesapla = " + Arrays.toString(uzHesapla));
    }


}

