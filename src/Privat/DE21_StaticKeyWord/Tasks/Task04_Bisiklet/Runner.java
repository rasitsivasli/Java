package Privat.DE21_StaticKeyWord.Tasks.Task04_Bisiklet;

import java.util.Scanner;

public class Runner {
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

        Bisiklet bisiklet = new Bisiklet();

        islemYap(bisiklet);

    }

    private static void islemYap(Bisiklet bisiklet) {
        Scanner scanner = new Scanner(System.in);
        int secim;
        do {
            System.out.println("""
                    \n
                    ---ISLEM MENUSU---\s
                    Hiz degistirmek icin 1,\s
                    Vites arttirmak icin 2,\s
                    Vites azaltmak icin 3,\s
                    Mevcut durum icin 4 ,
                    Cikis icin 0 tuslayiniz :\s""");
            System.out.print("Seciminiz : ");
            secim = scanner.nextInt();
            switch (secim){
                case 1 : bisiklet.hizDegistir(); break;
                case 2 : bisiklet.vitesArttir(); break;
                case 3 : bisiklet.vitesAzalt();  break;
                case 4 : bisiklet.durumGoster(); break;
                case 0 : System.out.println("Cikis yaptiniz");break;
                default: System.out.println("Yanlis giris yaptiniz");

            }
        } while (secim != 0);
    }


}
