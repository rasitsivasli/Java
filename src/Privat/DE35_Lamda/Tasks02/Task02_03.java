package Privat.DE35_Lamda.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task02_03 {
/* list in en büyük 5 eleman?n?n küçükten buyuye do?ru ekrana yazd?r?n
e?er ayn? elemandan 2 adet varsa, sadece birini kullan?n
a?a??daki örnek için ç?kt?
45 46 54 58 61
?eklinde olamal?d?r
 */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>
                (Arrays.asList(58, 7, 54, 46, 54, 7, 38, 7, 7, 61, 46, 45, 25, 16));
        System.out.println(list);
        List<Integer> yeniList = list.stream().sorted().distinct().toList();
        System.out.println("yeniList = " + yeniList.stream().skip(yeniList.size()-5).toList());
    }
}
