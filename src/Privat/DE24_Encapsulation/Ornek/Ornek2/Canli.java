package Privat.DE24_Encapsulation.Ornek.Ornek2;

public class Canli {
    private String tur;
    private int dYili;

    public Canli() {
    }

    public Canli(String tur, int dYili) {
        setTur(tur);
        setdYili(dYili);
    }

    public String getTur() {

        switch (tur) {
            case "I":
                tur = "Insan";
                break;
            case "H":
                tur = "Hayvan";
                break;
            case "Cocuk":
                tur = "Bitki";
                break;
        }
        return tur;
    }

    public void setTur(String tur) {
        tur = tur.substring(0, 1).toUpperCase();
        switch (tur) {
            case  "I" : break;
            case  "H" : break;
            case  "Cocuk" : break;
            default:
                System.out.println("Hatali giris yaptiniz");
        }this.tur=tur;
    }

    public int getdYili() {
        return dYili;
    }

    public void setdYili(int dYili) {
        this.dYili = dYili;
    }
}