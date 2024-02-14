package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.Arrays;
import java.util.List;

public class T05_Cozum2 {
    public static void main(String[] args) {
        // Bir string dizisinde 20 kişilik bir sınıfın doüum günleri (""pazartesi", "salı" ...
        // her bir günde doğan kaç kişi vardır yazdırınız
        String[] dogumGunleri = {"Pazartesi", "Cuma", "Sali", "Cuma", "Sali", "Sali", "Cuma",
                "Çarşamba", "Pazartesi", "Cuma", "Pazartesi", "Cuma", "Çarşamba", "Cuma",
                "Sali", "Çarşamba", "Cuma", "Sali", "Cuma", "Sali"};

        List<String> list = Arrays.asList(dogumGunleri);
        System.out.println("Liste: " + list);

        for (int i = 0; i < list.size(); i++) {
            // Eğer bu günü daha önce işlediysek devam et
            if (list.get(i).equals("")) {
                continue;
            }

            int count = 1; // Kendisi de sayıya dahil edilecek

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    list.set(j, ""); // Aynı günü bir daha saymamak için işaret koy
                }
            }

            System.out.println(dogumGunleri[i] + " günü doğan " + count + " öğrenci vardır");
        }
    }
}
