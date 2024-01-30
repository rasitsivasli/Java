package _____OSA_____.DE40InterviewQuestions.Day05;

import java.util.*;

public class Q06_AddedOrNotTask {

    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarli eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 1, 2, 5, 75, 75, 75, 4, 5, 3, 15, 4));
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (Integer integer : list) {
                if (list.get(i).equals(integer)) {
                    count++;
                }
            }
            if (count > 1) map.put(list.get(i), count);
        }
        System.out.println("Tekrarlanan sayi adedi " + map.keySet().size());
        System.out.println("Tekrarlanan sayilar " + map.keySet());


        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            System.out.println(integerIntegerEntry.getKey() + " elemani " + integerIntegerEntry.getValue() + " defa kullanilmistir");
        }
        System.out.println();
        ikiciYol(list);
    }


    private static void ikiciYol(List<Integer> list) {
        List<Integer> tekrarlananlar = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    if (!tekrarlananlar.contains(list.get(i))) tekrarlananlar.add(list.get(i));
                }

            }
        }
        System.out.println("tekrarlananlar = " + tekrarlananlar);

    }

}
