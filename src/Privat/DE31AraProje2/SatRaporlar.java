package Privat.DE31AraProje2;

import java.util.Scanner;

public class SatRaporlar {

    protected static void birMusteriHesapDokumu() {
        MusIslemler dbMus = new MusIslemler();
        dbMus.veriList();
        Scanner scan = new Scanner(System.in);
        System.out.print("Raporlamak istedi?iniz M�sterinin ID sini giriniz : ");
        try {
            int mID = scan.nextInt();
            Musteriler mus = Runner.musList.get(mID);
            if (mus != null) {
                if (mus.getDurum() == Durum.AKTIF) {
                    SatIslemler.baslikPrint();
                    int topTutar = 0;
                    int topTahsilat = 0;
                    for (Satislar val : Runner.satList.values()) {
                        if (val.getDurum() == Durum.AKTIF && val.getMusID() == mID) {
                            System.out.println(val);
                            topTutar += val.getTutar();
                            topTahsilat += val.getTahsilat();
                        }
                    }
                    System.out.println("\nM�?teriye yap?lan  ");
                    System.out.println("Toplam sat??    : " + topTutar);
                    System.out.println("Toplam tahsilat : " + topTahsilat);
                    System.out.println("Kalan Bakiye    : " + (topTutar - topTahsilat));
                } else {
                    System.out.println("Bu kay?t silinmi?...");
                }
            } else {
                System.out.println(mID + " : nolu ID kay?tlarda yok  ");
            }
        } catch (Exception _) { // dikkat "_" kullan?m? JDK 21 ile geldi, hi� Exception objesi olu?mad?
            System.out.println("Hatal? ID giri?i");
        }
        System.out.println("\n");
    }

    protected static void topSatisOzeti() {
        SatIslemler.baslikPrint();
        int topTutar = 0;
        int topTahsilat = 0;
        for (Satislar val : Runner.satList.values()) {
            if (val.getDurum() == Durum.AKTIF) {
                System.out.println(val);
                topTutar += val.getTutar();
                topTahsilat += val.getTahsilat();
            }
        }
        System.out.println("\n  ");
        System.out.println("Toplam sat??    : " + topTutar);
        System.out.println("Toplam tahsilat : " + topTahsilat);
        System.out.println("Kalan Bakiye    : " + (topTutar - topTahsilat));
        System.out.println("\n");
    }


    protected static void musterilerBakiyeListesi() {
        bakiyeleriDoldur();
        putBaslik();
        for (Musteriler mus : Runner.musList.values()) {
            System.out.printf("%5s%20s%10s\n", mus.getId(), mus.getAdSoyad(), mus.getBakiye());
        }
        System.out.println("\n");

    }

    protected static void borcluMusteriler() {
        bakiyeleriDoldur();
        putBaslik();
        for (Musteriler mus : Runner.musList.values()) {
            if (mus.getBakiye() > 0)
                System.out.printf("%5s%20s%10s\n", mus.getId(), mus.getAdSoyad(), mus.getBakiye());
        }
        System.out.println("\n");
    }

    protected static void putBaslik() {
        System.out.printf("%5s%20s%10s\n", "ID", "Isim", "Bakiye");
        System.out.printf("%5s%20s%10s\n", "=====", "==========", "======");
    }

    protected static void bakiyeleriDoldur() {
        for (Musteriler mus : Runner.musList.values()) {
            int bakiye = 0;
            for (Satislar sat : Runner.satList.values()) {
                if (sat.getMusID() == mus.getId()) {
                    bakiye += sat.getTutar() - sat.getTahsilat();
                }
            }
            mus.setBakiye(bakiye);
        }

    }


}


