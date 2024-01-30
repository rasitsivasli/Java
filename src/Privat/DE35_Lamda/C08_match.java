package Privat.DE35_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_match {
    /*
         Match operasyonu bir ak???n belirli kriterleri sa?lay?p sa?lamad???n? �l�mek i�in kullan?l?r.
        Map den fark? her iterasyonu tek tek de?erlendirip sonucu yans?tmaz bunun yerine t�m koleksiyonu
        de?erlendirerek sonucu yans?tmas?d?r. Match operasyonunun 3 �e?it kullan?m? bulunmaktad?r;

            anyMath(): Verece?imiz ?arta ba?l? olarak Stream i�erisinde gezinir ve
            herhangi bir elemanla e?le?me durumunda true d�necektir.

            allMatch(): Verilen ?arta g�re Stream i�erisindeki t�m elemanlar?n
            bu ?arta uymas? durumunda true d�necektir.

            noneMatch(): ?arta g�re Stream i�indeki hi� bir
            eleman?n ?art? sa?lamamas? durumunda true d�necektir.
         */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList
                (11, 12, 7, 32,7 ,32, 41, 40, 32, 65, 41, 12, 7, 41, 43, 24, 32));
        System.out.println(list.stream().anyMatch(p -> p % 10 == 0)); // 10 a b��nen varsa true, yoksa false
        System.out.println(list.stream().allMatch(p -> p % 2 == 0)); // false
        System.out.println(list.stream().map(p->p*2).allMatch(p -> p % 2 == 0)); // true
        System.out.println(list.stream().map(p->p*2).noneMatch(p -> p % 2 == 0)); // false
        System.out.println(list.stream().noneMatch(p -> p > 80));// (tumu false ise true)true
        // ayn?s?n? allMach ile yapal?m
        System.out.println(list.stream().allMatch(p -> p <= 80));//



    }
}
