package CodeChallenges.Boz.Arrays;

import java.util.Arrays;

public class Task2 {// dizideki herbir variabel in uzunlugunu hesaplayan method.

    public static void main(String[] args) {
        String[] isimler= {"ali","ayse","veli","isa","semsi"};
        uzHesapla(isimler);

    }

    private static void uzHesapla(String[] isimler) {
        String yeni="";
        for (int i = 0; i < isimler.length; i++) {

            yeni += isimler[i].length()+",";
        }
        System.out.println("yeni = " + yeni.substring(0,yeni.length()-1));


    }
}
