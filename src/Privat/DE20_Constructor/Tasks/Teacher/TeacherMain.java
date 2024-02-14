package Privat.DE20_Constructor.Tasks.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherMain {
    /*field ları  id,ad,name,brans, tecrube, maas, emekli
   olan bir Teacher class ı oluşturun
  Constructor ve toString metotları oluşturun
  10 adet ogretmen  verisi oluşturup bunları bir array liste atın
 daha sonra, emekli olmayanları, ad soyad ve maaşlarını liste şeklinde yazdırın
   */
    public static void main(String[] args) {
        Teacher bilgiler;
        List<Teacher> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            bilgiler = veriToplama();
            list.add(bilgiler);
        }
        for (int i = 0; i < 2; i++) {
            if (!list.get(i).emekliMi) System.out.println(list.get(i).ad+" "+list.get(i).soyAd+" "+list.get(i).maas);
        }
    }

    private static Teacher veriToplama() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID numarasi giriniz : ");
        int id = scanner.nextInt();
        System.out.print("Ad giriniz : ");
        String ad = scanner.next();
        System.out.print("Soy ad giriniz : ");
        String soyAd = scanner.next();
        System.out.print("Brans giriniz : ");
        String brans = scanner.next();
        System.out.print("Tecrübe yilinizi giriniz : ");
        int tecrube = scanner.nextInt();
        System.out.print("Maas giriniz : ");
        int maas = scanner.nextInt();
        System.out.print("Emekli mi? true or false : ");
        boolean emekliMi = scanner.nextBoolean();
        Teacher veriler = new Teacher(id, ad, soyAd, brans, tecrube, maas, emekliMi);
        return veriler;
    }
}
