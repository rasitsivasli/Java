package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.Arrays;
import java.util.List;

public class T05_HangiGunKacKisiDogdu {
    public static void main(String[] args) {
        // Bir string dizisinde 20 kişilik bir sınıfın doüum günleri (""pazartesi", "salı" ...
        // her bir günde doğan kaç kişi vardır yazdırınız
        String[] dogumGunleri = {"Pazartesi", "Cuma", "Sali", "Cuma", "Sali", "Sali", "Cuma",
                "Çarşamba", "Pazartesi", "Cuma", "Pazartesi", "Cuma", "Çarşamba", "Cuma",
                "Sali", "Çarşamba", "Cuma", "Sali", "Cuma", "Sali"};

        List<String> list = Arrays.asList(dogumGunleri);
        System.out.println("list = " + list);

        for (int i = 0; i < list.size(); i++) {
            int count = 1;// kendisini de dahil etmeliyiz
            // Aynı günü bir daha işleme almamak için kontrol ekle
            if (!list.get(i).equals("x")) {
                for (int j = i+1; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) {
                        count++;

                        list.set(j, "x"); // Ayni satira bir daha bakmamasi icin x ile isaretledik
                    }
                }
                System.out.println(dogumGunleri[i] + " günü doğan " + count + " öğrenci vardır");
            }
        }
    }
}
