package Privat.DE31AraProje2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SatIslemler implements InterIslem{
    @Override
    public void veriAdd() {
        // kullan?c?dan veri al?n?p listeye konulacak
        // id yi siz hesaplay?n

        // durum = true
        // dosyaya diziyi yazd?rabiliriz
        MusIslemler dbMus = new MusIslemler();
        dbMus.veriList();
        System.out.println("\n\n\n - Yeni Satis Ekleme -  ");
        System.out.println(Runner.c_GRAY+"(vaz geçmek için i?lem alan?na * yaz?n)"+ Runner.c_RESET+Runner.ITALIC);
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        try {
            System.out.print("??lem yap?lacak musteri ID si ? : ");
            int musID = scan2.nextInt();
            Musteriler musKayit = Runner.musList.get(musID);
            if (musKayit == null) {
                System.out.println("Kay?t bulunamad?");
            } else {
                if (musKayit.getDurum() == Durum.SILINMIS) System.out.println("Mü?teri Kayd? Silinmi? ??lem Yap?lamaz");
                else {
                    System.out.print("Yap?lan ??lem ? : "); String islem = scan.nextLine();
                    System.out.print("??lem Tutar?  ? : "); int tutar    = scan2.nextInt();
                    System.out.print("Tahsilat Tutar??: "); int tahsilat = scan2.nextInt();

                    LocalDateTime now = LocalDateTime.now();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    String tarih = dtf.format(now);

                    if (islem.charAt(0) != '*') {
                        Runner.satSonID++;
                        Satislar kayit = new Satislar(Runner.satSonID,musID,tarih,islem,tutar,tahsilat,Durum.AKTIF);
                        System.out.print("Yeni kay?t ekliyor......... ");
                        Runner.satList.put(Runner.satSonID,kayit);
                        SatFileHelper.dosyayaYaz();
                    } else System.out.println("??lemden vaz geçildi..... \nx");
                }
            }



        } catch (Exception e) {
            System.out.println("Hatal? giri?...");
        }

    }

    @Override
    public void veriUpdate(){
        veriList();
        // ID yi sor, bu ID array listte bul bu ID n?n oldu?u kay?tta durumu false yap
        Scanner scan = new Scanner(System.in);
        System.out.print(" Güncellemek istedi?iniz Sat?? ??leminin ID si ? : ");
        try {
            int id=scan.nextInt();
            Satislar kayit = Runner.satList.get(id);// silinecek kayit icin bir yeni obje uretiliyor
            if (kayit == null) System.out.println("Aran?lan ID bulunamad?");// eger map te yoksa null dur.
            else if (kayit.getDurum()==Durum.SILINMIS) System.out.println("Kay?t silinmi? güncellenemez..");
            else upDate(kayit);// varsa guncelleye yolluyoruz
        } catch (Exception e) {
            System.out.println("Hatal? giri?");
        }

        System.out.println();
    }

    private void upDate(Satislar kayitOld) {

        Scanner scan = new Scanner(System.in);
        System.out.println("De?i?iklik yapmak istemdi?iniz alanlara * yazarak geçin");
        String format = Runner.c_GRAY+" (%30s)"+Runner.c_BLACK+": ";
        try {
            System.out.printf("Yap?lan ??"+format,kayitOld.getIslem());         String islem = scan.nextLine();
            System.out.printf("??lem Tutar?   "+format,kayitOld.getTutar());    String tutarS = scan.nextLine();
            System.out.printf("Tahsiat Tutar? "+format,kayitOld.getTahsilat()); String tahsilatS = scan.nextLine();
            if (islem.charAt(0) == '*')     islem   = kayitOld.getIslem();
            if (tutarS.charAt(0) == '*')     tutarS   = kayitOld.getTutar()+"";
            if (tahsilatS.charAt(0) == '*')  tahsilatS= kayitOld.getTahsilat()+"";
            int tutar = Integer.parseInt(tutarS);
            int tahsilat = Integer.parseInt(tahsilatS);
            Satislar kayitNew = new Satislar(kayitOld.getId(), kayitOld.getMusID(), kayitOld.getTarih(), islem,tutar,tahsilat,Durum.AKTIF);

            System.out.println("Kayd?n Eski hali :"+kayitOld);
            System.out.println("Kayd?n Yeni hali :"+kayitNew);
            System.out.println("De?i?iklik kaydedilsin mi? (e/h)");
            String secim = scan.nextLine().toLowerCase();
            if (secim.charAt(0)=='e') {
                //kayd? güncelle
                Runner.satList.put(kayitNew.getId(),kayitNew);
                SatFileHelper.dosyayaYaz();
            } else {
                System.out.println("De?i?ikli iptal edilildi");
            }
        } catch (Exception e) {
            System.out.println("Hatal? giri?");
        }

        System.out.println();
    }

    @Override
    public void veriDelete(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Silmek veya Silinmi?ten geri almak istedi?iniz Mü?terinin ID si ? : ");
        try {
            int id=scan.nextInt();
            Satislar kayit = Runner.satList.get(id);
            if (kayit == null) System.out.println("Aran?lan ID bulunamad?");
            else {
                if (kayit.getDurum()==Durum.SILINMIS) {
                    kayit.setDurum(Durum.AKTIF);
                    System.out.println("Kay?t ba?ar? ile geri al?nd?");
                }  else {
                    kayit.setDurum(Durum.SILINMIS);
                    System.out.println("Kay?t ba?ar? ile silindi");
                }
        //        Runner.satList.put(kayit.getId(), kayit); // mutuble oldu?unda , yukardaki e?itleem nedeni ile buna gerek kalm?yor
        // kafa kar???yorsa         Runner.satList.put(kayit.getId(), kayit); eklenebilir
                SatFileHelper.dosyayaYaz();
            }
        } catch (Exception e) {
            System.out.println("Hatal? giri?");
        }
        System.out.println();
    }
    @Override
    public void veriList(){
        // verileri ekrana yaz ama durum  = true olanlar?
       baslikPrint();
        for (Satislar val : Runner.satList.values()){
            if (val.getDurum()==Durum.AKTIF)System.out.println(val);
        }
        System.out.println();
    }



    @Override
    public void veriDeletedList(){
        // verileri ekrana yaz ama durum  = false olanlar?
        baslikPrint();
        for (Satislar val : Runner.satList.values()){
            if (val.getDurum()==Durum.SILINMIS)System.out.println(val);
        }
        System.out.println();
    }
    protected static void baslikPrint(){
        String line = String.format("%6s","ID");
        line  = line + String.format("%10s","Mus ID");
        line  = line + String.format("%15s","Tarih");
        line  = line + String.format("%20s","??lem");
        line  = line + String.format("%12s","Tutar");
        line  = line + String.format("%12s","Tahsilat");
        System.out.println(Runner.BOLD+line+Runner.c_RESET+Runner.ITALIC);
        line = String.format("%6s" ,"=====");
        line  = line + String.format("%10s","======");
        line  = line + String.format("%15s","==========");
        line  = line + String.format("%20s","=============");
        line  = line + String.format("%12s","==========");
        line  = line + String.format("%12s","==========");
        System.out.println(line);
    };

}
