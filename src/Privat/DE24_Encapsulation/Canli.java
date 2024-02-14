package Privat.DE24_Encapsulation;

public class Canli {
    private String tur;
    private int dYili;

    public Canli() {
    }
    public Canli(String tur, int dYili) {
        // veri contuctor ile gelince düzelmemiş oluyor, dolayısı ile bir eksiklik var
        this.tur = tur;
        this.dYili = dYili;
    }
//    public void setTur(String tur){
//        this.tur = tur;
//    }
//    public String getTur(){
//        return this.tur; // veya bu da aynısıdır -> return tur;
//    }
    public String getTur() {
        switch (tur) {
            case "I" : tur="Insan";break;
            case "H" : tur="Hayvan";break;
            case "Cocuk" : tur="Bitki";break;
        }
        return tur;
    }

    protected void setTur(String tur) {
        tur = tur.substring(0,1).toUpperCase();
        switch (tur) {
            case "I","H","Cocuk" : break;
            default:
                System.out.println("hatalı Tür girişi");
        }
        this.tur = tur;
    }

    public int getdYili() {
        return dYili;
    }

    public void setdYili(int dYili) {
        this.dYili = dYili;
    }
}
