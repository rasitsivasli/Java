package Privat.DE20_Constructor.selbst;

public class Ornek {
//    int sayi;// instant varaiable
    static int sayi2 ;// class oder static variable

    public static void main(String[] args) {
        Ornek veri1 = new Ornek();
        Ornek veri2 = new Ornek();

//        veri1.sayi = 11;// instance variable i cagirmak icin obje olusturulmali
//        System.out.println("veri1.sayi = " + veri1.sayi);
//        veri2.sayi = 210;
//        System.out.println("veri2.sayi = " + veri2.sayi);


        veri1.sayi2 = 12;// static oldugu icin en son atadigimiz ver gecerli
        veri2.sayi2 = 220;

        System.out.println("bir onceki  " + veri2.sayi2);
        System.out.println("en son deger : " + sayi2);

//        System.out.println("veri1.sayi2 = " + veri1.sayi2);// yine 220 yaziyor cunku degisti

    }

}
