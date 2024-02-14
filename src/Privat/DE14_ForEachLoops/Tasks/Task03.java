package Privat.DE14_ForEachLoops.Tasks;

public class Task03 {
    public static void main(String[] args) {
        double[] arr = {90, 55, 66.5, 90, 55.7, 25};//
        // yukarıdaki şekilde bir array içerisinde öğrencilerin notları verilmiştir
        //  49.5 ve üstü alan öğrenciler sınıfı geçmiştir,
        //  ayrıca ortalamadan daha yukarı not alanlar da sınıfı geçmiştir
        // sınıfı geçemeyenlerin notlarını yazdırın , for-each ile yapın
        double toplam = 0;
        double ortalama = 0;

        for (double sayi : arr) {
            toplam += sayi;
        }
        System.out.println("ortalama = " + toplam / arr.length);

        for (double w : arr) {
            if (w < 49.5 || w < ortalama) {
                System.out.print(w + ",");
            }
        }
    }
}
