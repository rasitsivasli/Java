package _____OSA_____.DE40InterviewQuestions.Day04;

import java.util.HashMap;
import java.util.Map;

public class Q08_FrequencyOfGivenCharacters_IkinciYol {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */

    public static void main(String[] args) {
        String str = "aaabbabbbccaccccccaq";
        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        System.out.println(result.toString());
    }




}
