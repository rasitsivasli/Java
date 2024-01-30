package Privat.DE31AraProje2;

import java.io.*;

public class SatFileHelper {
    final static String filePath=System.getProperty("user.dir")+"/Satislar.txt";

    public static void dosyayaYaz() {
        File file = new File(filePath); // dosya objesini path+isim ile olu?turuyoruz

        try {
            FileWriter fWriter = new FileWriter(file,false);
            //  FileWriter fWriter = new FileWriter(file,true) eski veriler gitmesin istersek boyle olur
            // apand false ise dosyadaki �nceki verileri siler
            BufferedWriter bWriter = new BufferedWriter(fWriter);

            for (Satislar val : Runner.satList.values()) {
                String line="";
                line += val.getId()+"*";
                line += val.getMusID()+"*";
                line += val.getTarih()+"*";
                line += val.getIslem()+"*";
                line += val.getTutar()+"*";
                line += val.getTahsilat()+"*";
                line += val.getDurum().ordinal()  ;

                bWriter.write(line);  // ekleme yap?yorsak bWriter.append(str1)
                bWriter.newLine();
            }

            bWriter.close();
            fWriter.close();
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Dosyaya yazma islemi Tamamland? \n\n");
        // listeyi dosyaya yaz
    }


    public static void dosyadanOku() {

        // dosyadan oku, musList e  aktar

        // dosyay? a�al?m
        File file = new File(filePath); // dosya objesini path+isim ile olu?turuyoruz
        if (!file.exists()) { // file yoksa olu?tural?m
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bReader = new BufferedReader(fileReader);
            String line;
            while ((line=bReader.readLine()) !=null){

                String[] arr = line.split("\\*");
                int id    = Integer.parseInt(arr[0]);
                int musID = Integer.parseInt(arr[1]);
                int tutar = Integer.parseInt(arr[4]);
                int tahsilat = Integer.parseInt(arr[5]);
                int durum = Integer.parseInt(arr[6]);
                Satislar kayit;
                // id,arr[1],arr[2],arr[3],arr[4],0,Durum.values()[durum]);
                kayit = new Satislar(id,musID,arr[2],arr[3],tutar, tahsilat,Durum.values()[durum] );
                Runner.satList.put(id,kayit);
                Runner.satSonID = id; // son Id nin burada saklanmas?n? sagl?yoruz
            }
            bReader.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }




        // listenin son eleman?n?n  ID sini  Runner.adresSonID ye alal?m

    }
}
