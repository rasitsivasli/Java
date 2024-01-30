package Privat.DE31AraProje2;

import java.util.Scanner;

public class MusIslemler implements InterIslem {
    @Override
    public void veriAdd() {
        // kullan?c?dan veri al?n?p listeye konulacak
        // id yi siz hesaplay?n

        // durum = true
        // dosyaya diziyi yazd?rabiliriz
        System.out.println("\n\n\n - Yeni Mü?teri Ekleme -  ");
        System.out.println(Runner.c_GRAY+"(vaz geçmek için telefon alan?na * yaz?n)"+ Runner.c_RESET+Runner.ITALIC);
        Scanner scan = new Scanner(System.in);
        System.out.print(" Ad Soyad ? : "); String adSoyad = scan.nextLine();
        System.out.print(" Adres    ? : "); String adres   = scan.nextLine();
        System.out.print(" E-Mail   ? : "); String eMail   = scan.nextLine();
        System.out.print(" Telefon  ? : "); String tel     = scan.nextLine();
        if (tel.charAt(0) != '*') {
            Runner.musSonID++;
            Musteriler kayit = new Musteriler(Runner.musSonID,adSoyad,adres,eMail,tel,0,Durum.AKTIF);
            System.out.print("Yeni kay?t ekliyor......... ");
            Runner.musList.put(Runner.musSonID,kayit);
            MusFileHelper.dosyayaYaz();
        } else System.out.println("??lemden vaz geçildi..... \nx");

    }

    @Override
    public void veriUpdate(){
        // ID yi sor, bu ID array listte bul bu ID n?n oldu?u kay?tta durumu false yap
        Scanner scan = new Scanner(System.in);
        System.out.print(" Güncellemek istedi?iniz Mü?terinin ID si ? : ");
        try {
            int id=scan.nextInt();
            Musteriler kayit = Runner.musList.get(id);
            if (kayit == null) System.out.println("Aran?lan ID bulunamad?");
            else if (kayit.getDurum()==Durum.SILINMIS) System.out.println("Kay?t silinmi? güncellenemez..");
            else upDate(kayit);
        } catch (Exception e) {
            System.out.println("Hatal? giri?");
        }

        System.out.println();
    }

    private void upDate(Musteriler kayitOld) {
        Scanner scan = new Scanner(System.in);
        System.out.println("De?i?iklik yapmak istemdi?iniz alanlara * yazarak geçin");
        String format = Runner.c_GRAY+" (%30s)"+Runner.c_BLACK+": ";
        System.out.printf("Ad Soyad"+format,kayitOld.getAdSoyad());  String adSoyad = scan.nextLine();
        System.out.printf("Adres   "+format,kayitOld.getAdres());    String adres   = scan.nextLine();
        System.out.printf("E-Mail  "+format,kayitOld.geteMail());    String eMail   = scan.nextLine();
        System.out.printf("Telefon "+format,kayitOld.getTel());      String tel     = scan.nextLine();
        if (adSoyad.charAt(0) == '*') adSoyad = kayitOld.getAdSoyad();
        if (adres.charAt(0) == '*')   adres   = kayitOld.getAdres();
        if (eMail.charAt(0) == '*')   eMail   = kayitOld.geteMail();
        if (tel.charAt(0) == '*')     tel     = kayitOld.getTel();
        Musteriler kayitNew = new Musteriler(kayitOld.getId(),adSoyad,adres,eMail,tel,0,Durum.AKTIF );
        System.out.println("Kayd?n Eski hali :"+kayitOld);
        System.out.println("Kayd?n Yeni hali :"+kayitNew);
        System.out.println("De?i?iklik kaydedilsin mi? (e/h)");
        String secim = scan.nextLine().toLowerCase();
        if (secim.charAt(0)=='e') {
            //kayd? güncelle
            Runner.musList.put(kayitNew.getId(),kayitNew);
            MusFileHelper.dosyayaYaz();
        } else {
            System.out.println("De?i?ikli iptal edilildi");
        }
        System.out.println();
    }

    @Override
    public void veriDelete(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Silmek veya Silinmi?ten geri almak istedi?iniz Mü?terinin ID si ? : ");
        try {
            int id=scan.nextInt();
            Musteriler kayit = Runner.musList.get(id);

            if (kayit == null) System.out.println("Aran?lan ID bulunamad?");
            else {
                if (kayit.getDurum()==Durum.SILINMIS) {
                    kayit.setDurum(Durum.AKTIF);
                    System.out.println("Kay?t ba?ar? ile geri al?nd?");
                }  else {
                    kayit.setDurum(Durum.SILINMIS);
                    System.out.println("Kay?t ba?ar? ile silindi");
                }
         //     Runner.musList.put(kayit.getId(), kayit); // mutable oldu?undan buna gerek kalmad?
         //     üstte " Musteriler kayit = Runner.musList.get(id);" bu ?ekilde refaranslar? e?itledi?imizden,
         //       birinde yapt???m?z de?i?iklik di?erinide etkiliyor.
              MusFileHelper.dosyayaYaz();
            }
        } catch (Exception e) {
            System.out.println("Hatal? id giri?");

        }
        System.out.println();
    }
    @Override
    public void veriList(){
        // verileri ekrana yaz ama durum  = true olanlar?
        String line = String.format("%5s","  ID ");
        line  = line + String.format("%30s","Ad Soyad");
        line  = line + String.format("%15s","Telefon");
        line  = line + String.format("%25s","eMail");
        line  = line + String.format("%30s","Adress");
        System.out.println(Runner.BOLD+line+Runner.c_RESET+Runner.ITALIC);
        line = String.format("%5s","=====");
        line  = line + String.format("%30s","=========");
        line  = line + String.format("%15s","=========");
        line  = line + String.format("%25s","=========");
        line  = line + String.format("%30s","=========");
        System.out.println(line);
        for (Musteriler val : Runner.musList.values()){
            if (val.getDurum()==Durum.AKTIF)System.out.println(val);
        }
        System.out.println();
    }



    @Override
    public void veriDeletedList(){
        // verileri ekrana yaz ama durum  = false olanlar?
        String line = String.format("%5s","  ID ");
        line  = line + String.format("%30s","Ad Soyad");
        line  = line + String.format("%15s","Telefon");
        line  = line + String.format("%25s","eMail");
        line  = line + String.format("%30s","Adress");
        System.out.println(Runner.BOLD+line+Runner.c_RESET+Runner.ITALIC);
        line = String.format("%5s","=====");
        line  = line + String.format("%30s","=========");
        line  = line + String.format("%15s","=========");
        line  = line + String.format("%25s","=========");
        line  = line + String.format("%30s","=========");
        System.out.println(line);
        for (Musteriler val : Runner.musList.values()){
            if (val.getDurum()==Durum.SILINMIS)System.out.println(val);
        }
        System.out.println();
    }




}
