package Privat.DE14_ForEachLoops.Tasks;

public class Task01 {
    public static void main(String[] args) {
        // Task-> iki string array elemanlarının ortak olmasını kontrol eden code create ediniz..
        // with for-each ortak elemanları yazdırın // contains v.s. kullanmayın
        String[] arr1 = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String[] arr2 = {"gülsüm", "musty", "ayşe", "enise", "ciğdem", "cüneyt"};
        System.out.print("Iki Arrayde de ortak olan kelimeler : ");
        for (String kelime1 : arr1) {
            for (String kelime2 : arr2) {
                if (kelime1.equals(kelime2)) System.out.print(kelime1+",");
            }
        }
    }

}
