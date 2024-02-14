package Privat.DE10_MethodCreation.Tasks;

public class Task28 {
    /*
    Task->
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 1 ile max(dahil) arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {

        int sayi=Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE = " + sayi);
        randomNum(sayi);
        System.out.println("Method dan gelen sayi : "+randomNum(sayi));

    }

    private static int randomNum(int sayi) {

        return (int) (Math.random()*sayi);
    }


}
