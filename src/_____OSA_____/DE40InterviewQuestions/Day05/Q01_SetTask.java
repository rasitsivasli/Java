package _____OSA_____.DE40InterviewQuestions.Day05;

import java.util.*;

public class Q01_SetTask {

    //  PART 1
    // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
    // and add all elements from ArrayList to Set

    // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
    // ve tüm öğeleri ArrayList'ten Set'e ekleyin

    // PART 2
    // create a method that takes Set<Character> and varargs of char as parameters
    // and adds all chars to the set

    // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
    // ve tüm karakterleri sete ekleyin

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set = new HashSet<>();

        metot1(arrList, set);

        Set<Character> setChar = new HashSet<>();
        metod2(setChar, 'a', 'b', 'c', 'd');
    }

    private static void metod2(Set<Character> setChar, char... charDizisi) {

        for (char c : charDizisi) {
            setChar.add(c);
        }
        System.out.println("setChar = " + setChar);
    }

    private static void metot1(ArrayList<Integer> arrList, Set<Integer> set) {

        set.addAll(arrList);
        System.out.println("set = " + set);
    }
}
