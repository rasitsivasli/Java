package Privat.DE20_Constructor.selbst;

public class Statik {
    int sayi;
    static int sayi2;// class variable

    public static void main(String[] args) {
        Statik veri1 = new Statik();
        Statik veri2 = new Statik();
        veri1.sayi = 10;
        sayi2 = 22;
        mtt();
        System.out.println("sayi2 = " + sayi2);
        veri2.sayi = 20;
        System.out.println("veri1.sayi = " + veri1.sayi);
        System.out.println("veri2.sayi = " + veri2.sayi);
        veri1.mtt2();
    }

    private static void mtt() {
        System.out.println("sayi2 = " + sayi2);
        sayi2++;

    }

    private void mtt2() {
        System.out.println("non static");
        Statik veri1 = new Statik();
    }
}
