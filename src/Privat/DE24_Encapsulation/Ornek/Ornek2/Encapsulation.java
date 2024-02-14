package Privat.DE24_Encapsulation.Ornek.Ornek2;

public class Encapsulation {
    public static void main(String[] args) {
        Canli can = new Canli();
        //can.setTur("Insan");
        //String tur ="";

       // String tur = can.tur; // class disindan ulasilamiyor, private old. icin


        //tur = can.getTur(); // kapsülleyerek veri alma
        //System.out.println(tur);
        can.setTur("Insan");
        System.out.println(can.getTur());

        

    }
}
