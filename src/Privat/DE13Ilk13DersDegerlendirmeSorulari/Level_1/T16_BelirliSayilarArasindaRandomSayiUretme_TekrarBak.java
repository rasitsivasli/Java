package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

public class T16_BelirliSayilarArasindaRandomSayiUretme_TekrarBak {
    /*   sayi=random(1,5) şeklinde bir metot create edin
    bu metot 1 ile 5 arasında (sayılar dahil) rastgele bir sayı üretsin

     */
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            int sayi = random(1, 5);
            System.out.print(sayi + ",");
        }
    }

    private static int random(int i, int i1) {

        return (int) (Math.random() * (i1 - i + 1) + i);// i1-i+1= kac adet üretilecegini bulmak icin yaptik, virgülden sonraki i ise kactan baslayacaksak onun icin

    }
}
