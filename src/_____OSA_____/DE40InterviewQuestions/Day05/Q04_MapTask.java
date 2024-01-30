package _____OSA_____.DE40InterviewQuestions.Day05;

import java.util.*;

public class Q04_MapTask {
    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]


    // BÖLÜM 1
    // anahtar olarak groupName ve değer olarak groupMembers ile bir map oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]

    // PART 2
    // find how many members each group has

    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul
    public static void main(String[] args) {

        Map<String, List<String>> map =new HashMap<>();

        List<String > list1 = new ArrayList<>(Arrays.asList("Uye1","Uye2"));
        List<String > list2 = new ArrayList<>(Arrays.asList("Uye3","Uye4","Uye5","Uye6"));

        map.put("Grup1",list1);
        map.put("Grup2",list2);

        map.entrySet().forEach(System.out::println);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" in eleman sayisi = "+ entry.getValue().size());
        }


    }



}
