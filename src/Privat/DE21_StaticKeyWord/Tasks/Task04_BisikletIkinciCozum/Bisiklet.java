package Privat.DE21_StaticKeyWord.Tasks.Task04_BisikletIkinciCozum;

public class Bisiklet {
    //Bisiklet Class :Properties(fields) : hiz, vites
   /* method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
    vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
    vites 5 den büyük ve 1 den küçük olamaz.*/
    int hiz;
    int vites;

    public Bisiklet() {
    }

    public Bisiklet(int hiz, int vites) {


    }

    public int hizdegistir(int yeniHiz) {
        return this.hiz = yeniHiz;
    }

    public void vitesArtir() {
        vites++;

    }

    public void vitesAzalt() {
        vites--;
    }

    public void durumGoster() {
        System.out.println("hiz=" + hiz +
                " vites=" + vites);
    }
}




