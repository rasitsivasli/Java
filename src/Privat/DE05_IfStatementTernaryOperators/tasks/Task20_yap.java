package Privat.DE05_IfStatementTernaryOperators.tasks;

public class Task20_yap {
    /*
    etkinlik öneren program
    Koşullar :
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */

    public static void main(String[] args) {

        int sic = (int) (Math.random() *60);
        System.out.println("Sicaklik : "+ sic+" derece");

        boolean durum1 = sic<5;
        boolean durum2 = sic>=5 && sic<15;
        boolean durum3 = sic>=15 && sic<25;
        boolean durum4 = sic>=25;

        if (durum1){
            System.out.println("Kayak");

        } if (durum2){
            System.out.println("Sinema");

        } if (durum3){
            System.out.println("Piknik");

        }else if (durum4) {
            System.out.println("Yüzme");
        }

    }
}
