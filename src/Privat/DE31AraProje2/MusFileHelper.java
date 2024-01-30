package Privat.DE31AraProje2;

import java.io.*;

public class MusFileHelper  {
    final static String filePath=System.getProperty("user.dir")+"/Musteriler.txt";

    public static void dosyayaYaz() {
        File file = new File(filePath); // dosya objesini path+isim ile olu?turuyoruz

        try {
            FileWriter fWriter = new FileWriter(file,false);
            //  FileWriter fWriter = new FileWriter(file,true) eski veriler gitmesin istersek boyle olur
            // apand false ise dosyadaki �nceki verileri siler
            BufferedWriter bWriter = new BufferedWriter(fWriter);

            for (Musteriler val : Runner.musList.values()) {
                String line="";
                line += val.getId()+"*";
                line += val.getAdSoyad()+ "*";
                line += val.getAdres()  + "*";
                line += val.geteMail()  + "*";
                line += val.getTel()    + "*";
                line += val.getDurum().ordinal()  ;

                bWriter.write(line);  // ekleme yap?yorsak bWriter.append(str1)
                bWriter.newLine();
            }

            bWriter.close();
            fWriter.close();
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("??lem Tamamland? \n\n");
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
                int durum = Integer.parseInt(arr[5]);
                Musteriler kayit;
                kayit = new Musteriler(id,arr[1],arr[2],arr[3],arr[4],0,Durum.values()[durum]);
                Runner.musList.put(id,kayit);
                Runner.musSonID = id; // son Id nin burada saklanmas?n? sagl?yoruz
            }
            bReader.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // listenin son eleman?n?n  ID sini  Runner.adresSonID ye alal?m

    }
}
