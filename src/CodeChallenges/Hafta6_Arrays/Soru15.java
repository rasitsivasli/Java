package CodeChallenges.Hafta6_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru15 {

    //String [] names={"ali","ayşe","john","ali","ayşe","john","asya"};
    //Verilen dizide unique karakteri bulun


    public static void main(String[] args) {


        List<String> list = new ArrayList<>(Arrays.asList("ali","asya","ayşe", "john", "ali", "ayşe", "john"));
        list.replaceAll(String::toLowerCase);
        System.out.println("list = " + list);
/*
        System.out.println("*******************Buradan oncesi önemli************");
        String str = Arrays.toString(names);
        System.out.println("str = " + str);// Diziyi String e ceviriyoruz...

        for (int i = 0; i < names.length; i++) {

            if (str.substring(str.indexOf(names[i])+1).contains(names[i])) {

                str = str.replace(names[i], "");

            }
        }System.out.println("str = " + str.replaceAll("\\W",""));*/


    }

}

