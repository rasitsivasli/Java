package _____OSA_____.DE40InterviewQuestions.Day05;

import java.util.*;

public class Q07_ConvertingCollectionsTask {

    // create an array of random numbers of size 10
    // convert that array into a list
    // convert list into set

    // 10 boyutunda rasgele sayılardan oluşan bir array oluştur
    // bu arrayi bir listeye dönüştür
    // listeyi sete çevir
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        System.out.println("arr = " + Arrays.toString(arr));

        List<Integer> listStreamIle = new ArrayList<>();
        listStreamIle = Arrays.stream(arr).boxed().toList();
        System.out.println("list = " + listStreamIle);

        Set<Integer> set = new HashSet<>();
        set.addAll(listStreamIle);
        System.out.println("set = " + set);
    }
}
