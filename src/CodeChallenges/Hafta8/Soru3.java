package CodeChallenges.Hafta8;

import java.util.ArrayList;
import java.util.List;

public class Soru3 {
    public static <list> void main(String[] args) {
        //Aşağıdaki listede polindrome olan kelimeri yazdırın.For Each Loop kullanarak
        String[] words = {"asa", "level", "java", "küçük", "kaza", "kazak", "yapay"};
        List<List<String>> list = new ArrayList<>();

        for (String kelime : words) {
            list.add(List.of(kelime.split("")));
        }
        for (List<String> w : list) {
            if (w.reversed().equals(w)) {
                System.out.println(w);
            }
        }


    }
}
