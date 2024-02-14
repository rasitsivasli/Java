package Privat.DE10_MethodCreation.Tasks;

public class Task19 {

    public static void main(String[] args) {
        /*
   Task->
   INTERVIEW SORUSU !!!
   1'den 100'e kadar hic rakam  kullanmadan sayilari print eden METHOD create ediniz

    */

rakamKullanmadanSayilariYazma();


    }

    private static void rakamKullanmadanSayilariYazma() {
        int sayi;
        for (char i = 'B'; i <='¦' ; i++) {//Cocuk nin ascii degeri 66 dir. ¦ degerinin ascii degeri 166 dir.
            if (i=='¦') {
                break;
            }
             sayi = i-'A';// ilk deger Cocuk (66) old icin 66-65= 1 den basliyoruz
            System.out.print(sayi+",");
        }

    }
}
