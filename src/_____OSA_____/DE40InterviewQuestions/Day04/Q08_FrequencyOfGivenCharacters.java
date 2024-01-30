package _____OSA_____.DE40InterviewQuestions.Day04;

import java.util.HashMap;
import java.util.Map;

public class Q08_FrequencyOfGivenCharacters {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */

    public static void main(String[] args) {
        String str = "aaabbabbbccaccccccaq";
        String [] dizi = str.split("");
        Map<String,Integer> map = new HashMap<>();
        for (String s : dizi) {
            int count = 0;
            for (String value : dizi) {
                if (s.equals(value)) count++;

            }

            map.put(s,count);
        }
        String str2 = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            str2+= entry.getKey().concat(String.valueOf(entry.getValue()));
        }
        System.out.println(str2);


    }




}
