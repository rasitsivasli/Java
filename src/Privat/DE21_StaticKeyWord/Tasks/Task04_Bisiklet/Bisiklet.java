package Privat.DE21_StaticKeyWord.Tasks.Task04_Bisiklet;

import java.util.Scanner;

/*
   Task 04->
    Bisiklet Class :Properties(fields) : hiz, vites
    method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
    vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
    vites 5 den büyük ve 1 den küçük olamaz.
    yukarıdaki methodları seçtirilen islemYap methodu ile B_RunnerMusteri class'da obj ile methodları çalıştırınız
   Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
    */
public class Bisiklet {
    int hiz;
    int vites=1;
    Scanner scanner = new Scanner(System.in);

    public Bisiklet() {
    }
    public void hizDegistir() {

        int hizSecimi;
        System.out.println("""
                Hizinizi 10 km yapmak icin 1,\s
                Hizinizi 20 km yapmak icin 2,\s
                Hizinizi 30 km yapmak icin 3,\s
                """);
        hizSecimi = scanner.nextInt();
        switch (hizSecimi) {
            case 1: hiz = 10; break;
            case 2: hiz = 20; break;
            case 3: hiz = 30; break;
        }
    }

    public void vitesArttir() {
        vites++;
    }

    public void vitesAzalt() {
        if (vites==1 || vites==5){
            System.out.println("Vites 1 den az 5 ten büyük olamaz");
        }else {
            vites--;
        }

    }

    public void durumGoster() {
        System.out.println("Mevcut hiziniz " + hiz + " km"+ "\nMevcut vitesiniz "+vites);

    }


    @Override
    public String toString() {
        return "Bisiklet{" +
                "hiz=" + hiz +
                ", vites=" + vites +
                '}';
    }
}
