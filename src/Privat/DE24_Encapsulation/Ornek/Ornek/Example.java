package Privat.DE24_Encapsulation.Ornek.Ornek;

public class Example {
    private  int sayi_private;
    protected int sayi_protected;
    public int sayi_public;

    public Example(int sayi_private, int sayi_protected) {
        this.sayi_private = sayi_private;
        this.sayi_protected = sayi_protected;
    }

    protected void privateInt(int sayi_private ){
       this.sayi_private=sayi_private;
   }

    @Override
    public String toString() {
        return "Example{" +
                "sayi_private=" + sayi_private +
                ", sayi_protected=" + sayi_protected +
                ", sayi_public=" + sayi_public +
                '}';
    }
}
