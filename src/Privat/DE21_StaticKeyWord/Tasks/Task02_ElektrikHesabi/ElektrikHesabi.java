package Privat.DE21_StaticKeyWord.Tasks.Task02_ElektrikHesabi;

import java.util.ArrayList;

public class ElektrikHesabi {
    int toplamTuketim;
    double oran;
    double fatura;

    public ElektrikHesabi() {
    }

    public ElektrikHesabi(int toplamTuketim, double oran, double fatura) {
        this.toplamTuketim = toplamTuketim;
        this.oran = oran;
        this.fatura = fatura;
    }
    public double elctrikHesaplama(){
        ArrayList<Double> faturalar = new ArrayList<>();
        ElektrikHesabi birinciFatura = new ElektrikHesabi(1000, 0.7, 1000 * 0.7); faturalar.add(birinciFatura.fatura);
        ElektrikHesabi ikinciFatura = new ElektrikHesabi(2000, 0.7, 2000 * 0.7);  faturalar.add(ikinciFatura.fatura);

        double odenecekToplam = 0;
        for (double w : faturalar) {
            odenecekToplam += w;
        }
        return odenecekToplam;
    }
    @Override
    public String toString() {
        return "ElektrikHesabi{" +
                "toplamTuketim=" + toplamTuketim +
                ", oran=" + oran +
                ", fatura=" + fatura +
                '}';
    }
}
