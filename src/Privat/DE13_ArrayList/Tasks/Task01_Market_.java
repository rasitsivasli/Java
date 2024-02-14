package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task01_Market_ {

    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */

    static ArrayList<String> gunler = new ArrayList<>(Arrays.asList("p.tesi", "salı", "carşamba", "perşembe", "cuma", "c.tesi", "pazar"));//1. adım
    static ArrayList<Double> gunlukKazanclar = new ArrayList<>();//2.adım

    static Scanner sc = new Scanner(System.in);
    static double haftaCirosu = 0;

    public static void main(String[] args) {

        getOrtalamaKazanc();

    }//methon sonu

    private static void getOrtalamaKazanc() {
        int i = 0;
        while (i < 7) {
            int kazanc = (int) (Math.random() * 100 + 40);
            gunlukKazanclar.add((double) kazanc);
            i++;
        }
        System.out.println("gunlukKazanclar = " + gunlukKazanclar);
        for (int i1 = 0; i1 < gunlukKazanclar.size(); i1++) {
            haftaCirosu += gunlukKazanclar.get(i1);
        }
        System.out.println("haftaCirosu = " + haftaCirosu);
        double ortalamaKazanc = haftaCirosu / 7;
        System.out.println("ortalamaKazanc = " + ortalamaKazanc);
        getOrtalamaninUstundeKazancGunleri(gunlukKazanclar, gunler, ortalamaKazanc);
        getOrtalamaninAltindaKazancGunleri(gunlukKazanclar, gunler, ortalamaKazanc);
    }

    private static void getOrtalamaninAltindaKazancGunleri(ArrayList<Double> gunlukKazanclar, ArrayList<String> gunler, double ortalamaKazanc) {
        System.out.print("Ortalama kazancin altindaki günler : ");
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < ortalamaKazanc) {

                System.out.print(gunler.get(i) + ",");
            }
        }
    }

    private static void getOrtalamaninUstundeKazancGunleri(ArrayList<Double> gunlukKazanclar, ArrayList<String> gunler, double ortalamaKazanc) {
        System.out.print("Ortalama kazancin uzerindeki günler : ");
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > ortalamaKazanc) {

                System.out.print(gunler.get(i) + ",");
            }
        }
        System.out.println();
    }

}
