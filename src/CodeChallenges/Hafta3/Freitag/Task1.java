package CodeChallenges.Hafta3.Freitag;

public class Task1 {

    public static void main(String[] args) {
         /*
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13
         toplam =364
         */

        int n=100;
        int toplam=0;

        for (int i =1 ; i <100 ; i++) {
            n--;
            if (n%13==0){
                toplam+=n;
                System.out.println(n+" ");

            }

        }System.out.println("toplam : "+toplam);







    }
}
