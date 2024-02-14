package Privat.DE21_StaticKeyWord.Tasks.Task04_BisikletIkinciCozum;

import java.util.Scanner;

public class
Runner {
    /*
    Task 04->
     Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile B_RunnerMusteri class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */



    public static void main(String[] args) {
// do while icerinde metotlar cagrilarak, menude metotlar cagrilacak. bunlara da bir rakam vererek cagirabiliriz. Switch case de yapilabilir.
        Scanner scanner= new Scanner(System.in);
        Bisiklet choose = new Bisiklet();

        int secim=0;
        do{
            System.out.println("Menuden yapacaginiz islemi seciniz: \n1. Vitesi arttirmak icin 1 e basiniz." +
                    "\n2. Vites azaltmak icin 2 ye basiniz.\n3. Hizi degistirmek icin 3 e basiniz.\n4. Hizi ve vites durumunu gormek icin 4 e basiniz.\n" +
                    "5. Cikmak icin 5 e basiniz.");
            secim=scanner.nextInt();
            switch (secim){
                case (1) : choose.vitesArtir();
                    if (choose.vites > 5) {
                        System.out.println("Vites 5 ten buyuk olamaz.");
                        choose.vites = 5;
                    }break;
                case (2) : choose.vitesAzalt();
                    if (choose.vites < 1) {
                        System.out.println("Vites 1 den kucuk olamaz.");
                        choose.vites = 1;
                    }break;
                case (3) : {
                    System.out.println("Yeni hizi giriniz: ");
                    choose.hiz=scanner.nextInt();
                    System.out.println("Yeni hiziniz: "+ choose.hizdegistir(choose.hiz));break;
                }
                case (4) : choose.durumGoster();break;
                case (5) : secim=5;break;
            }

        }while (secim!=5);



    }









}
