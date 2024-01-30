package Privat.DE35_Lamda.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task02_02 {
    /*
     skip ve limit kullanarak dizinin 5. eleman?ndan 10. elaman?na kadar olan k?sm? al?n
     yani dizinin yeni hali [7,38,7,7,61 olaml?]
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>
                (Arrays.asList(58, 7, 54, 46, 54, 7, 38, 7, 7, 61, 46, 45, 25, 16));
        List<Integer> yeniList = new ArrayList<>();
        yeniList=list.stream().limit(10).skip(5).toList();
        System.out.println("yeniList = " + yeniList);

    }
}
