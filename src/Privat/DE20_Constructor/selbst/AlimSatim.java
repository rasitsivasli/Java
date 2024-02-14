package Privat.DE20_Constructor.selbst;

public class AlimSatim {
    public static void main(String[] args) {
        Arac arac1 = new Arac();
        System.out.println("arac1.km = " + arac1.km);
        System.out.println("arac1.renk = " + arac1.renk);
        System.out.println();
        Arac arac2 = new Arac(30000, "red");
        System.out.println("arac2.km = " + arac2.km);
        System.out.println("arac2.renk = " + arac2.renk);
        System.out.println();
        Arac arac3 = new Arac(1000, "Schwarz", false);
        System.out.println("arac3.km = " + arac3.km);
        System.out.println("arac3.renk = " + arac3.renk);
        System.out.println("arac3.renk = " + arac3.kazasizMi);
    }
}
