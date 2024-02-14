package CodeChallenges.Hafta8;

public class Soru1 {
    public static void main(String[] args) {
        /*
    Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz"
    yazisini yazdir

         */


        for (int i = 0; true; i++) {
            int zar1 = (int) (Math.random() * 6+1);
            System.out.println("zar1 = " + zar1);
            int zar2 = (int) (Math.random() * 6+1);
            System.out.println("zar2 = " + zar2);
            int toplam = zar1+zar2;
            System.out.println("toplam = " + toplam);
            if (zar1 + zar2 == 9) {
                System.out.println("Kazandiniz");
                break;
            } else System.out.println("Tekrar deneyiniz");
        }
    }
}
