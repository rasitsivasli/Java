package CodeChallenges.Projeler.Manav_FarkliSoru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Manav {
    /*TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları teker teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan aşağıysa o günleri return yap.*/
    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    public static void main(String[] args) {
        ArrayList<Integer> gunlukKazanclar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 7) {
            System.out.print(gunler.get(i) + " gunku kazanc : ");
            int kazanc = scanner.nextInt();
            gunlukKazanclar.add(kazanc);
            i++;
        }
        getOrtalamaKazanc(gunlukKazanclar);
    }
    private static void getOrtalamaKazanc(ArrayList<Integer> gunlukKazanclar) {
        double ortalamaKazanc = 0;
        int toplamKazanc = 0;
        for (int kazanc : gunlukKazanclar) toplamKazanc += kazanc;

        ortalamaKazanc = (double) toplamKazanc / 7;
        System.out.println("Ortalama Kazanc : " + ortalamaKazanc);
        getOrtalamaninUstundeKazancGunleri(ortalamaKazanc, gunlukKazanclar);
    }

    private static void getOrtalamaninUstundeKazancGunleri(double ortalamaKazanc, ArrayList<Integer> gunlukKazanclar) {
        ArrayList<String> ortalamaninUstundeGunler = new ArrayList<>();
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > ortalamaKazanc) ortalamaninUstundeGunler.add(gunler.get(i));
        }
        System.out.println("ortalamaninUstundeGunler = " + ortalamaninUstundeGunler);
        getOrtalamaninAltindaKazancGunleri(ortalamaKazanc, gunlukKazanclar);
    }


    private static void getOrtalamaninAltindaKazancGunleri(double ortalamaKazanc, ArrayList<Integer> gunlukKazanclar) {
        ArrayList<String> ortalamaninAltindaGunler = new ArrayList<>();
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < ortalamaKazanc) ortalamaninAltindaGunler.add(gunler.get(i));
        }
        System.out.println("ortalamaninAltindaGunler = " + ortalamaninAltindaGunler);
    }
}
