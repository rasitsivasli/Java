package Privat.DE20_Constructor.selbst;

public class Arac {

    int km = 20000;
    String renk = "Kirmizi";
    boolean kazasizMi = true;

    public Arac() {
        System.out.println("Alinir mi");
    }

    public Arac(int km, String renk) {
        this.km = km;
        this.renk = renk;

    }
    public Arac(int i, String schwarz, boolean b) {

        this.km = i;
        this.renk = schwarz;
        this.kazasizMi = b;

    }
}
