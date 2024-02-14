package Privat.DE21_StaticKeyWord.Tasks.Task01_Rectangle;

public class Runner {
     /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */

    public static void main(String[] args) {

        Rectangle obj1 = new Rectangle(4,5);// metod a verileri gönderdik
        int cevre = obj1.cevreHesaplama();// metodu cagirdik
        int alan = obj1.alanHesaplama();// metodu cagirdik

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);


    }
}
