package Privat.DE08_Loops.L01_ForLoops.Tasks;

public class Task19 {

    public static void main(String[] args) {

        /* Task -> İlk 10 doğal sayının toplamını print eden code create ediniz.
         */
        int toplam =0;

        for (int i = 0; i < 10; i++) {
            toplam=toplam+i;

        }
        System.out.println("toplam = " + toplam);
    }
}
