package CodeChallenges.Hafta3.Freitag;

import java.util.Scanner;

public class Task5_ForIle_TekrarYapildi {

    public static void main(String[] args) {
        //Print number ,letter and character
        //String str= "AsyaCool123^+%&"

        String str = "AsyaCool!'34%&/(";
        String digit = "";
        String letter = "";
        String charater = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= '0' && c <= '9') {
                digit = digit + c;

            } else if (c >= 'a' && c <= 'z') {

                letter += c;
            } else if (c >= 'A' && c <= 'Z') {

                letter += c;

            } else {
                charater += c;
            }

        }
        System.out.println("digit:"+digit);
        System.out.println("charater:"+charater);
        System.out.println("letter:"+letter);
    }

    }



