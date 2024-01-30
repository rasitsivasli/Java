package SerbetCalismalar.Enum.Enum1;

import static SerbetCalismalar.Enum.Enum1.Renkler.*;

public class Enum1 {

    public static void main(String[] args) {
        // yukarida classi import ettik. bu sekilde classin ismini yazmaya gerek yok
        Renkler r1 = Renkler.BLUE;
        Renkler r2 = GREEN;
        Renkler r3 = Renkler.GRAY;

        if (r1==WHITE) System.out.println("aynidir");
        else System.out.println("ayni degildir");
        switch (r1){
            case RED -> System.out.println("Renk kirmizidir");
            case BLACK -> System.out.println("Renk siyahtir");
        }
        System.out.println(r1.name());// name adini verir
        String renk1 = r1.name();// bu sekilde String yapabiliriz
        renk1 = r1.toString();// yeniden stringe cevirdik
        System.out.println("r1.equals(r2) = " + r1.equals(r2));// esit mi degil mi
        System.out.println("r1.ordinal() = " + r1.ordinal());// kendi icinde bir indexi vardir bizim verdigimiz siraya göre onun sirasini verir
        System.out.println(r1.compareTo(r2));// iki eleman arasindaki index farkini verir. r1-r2=-4
        System.out.println(GREEN.compareTo(BLUE));//4 verir
        System.out.println("RED.compareTo(RED) = " + RED.compareTo(RED));//0
    }
}
