package _____OSA_____.DE40InterviewQuestions.Day04;

import java.util.List;
import java.util.stream.Stream;

public class Q11_SurviveMonkey {
    /*
    There is a lonely monkey in the island
    He needs to eat 4 bananas every day
    there are just 165 bananas in that island
    Create following variables and find how many days
    monkey can survive.
    Use do while loop, increment and decrement and if statements
    int numberOfBananas =165,
    survivalDays = 1;
    boolean monkeyAlive = true;// maymun canli
    */
    public static void main(String[] args) {

        boolean monkeyAlive = true;
        int numberOfBananas = 165, survivalDays = 0;

        do {
            numberOfBananas -= 4;
            if (numberOfBananas < 0) monkeyAlive = false;
            else survivalDays++;


        } while (monkeyAlive);
        System.out.println(survivalDays);
        lamdaCozum();


    }

    private static void lamdaCozum() {
        int numberOfBananas2 = 165;
        System.out.println(Stream.iterate(numberOfBananas2, p -> p >= 4, p -> p - 4).count()+
                " gun hayatta kalmistir");

        List<Integer> list ;
        list = Stream.iterate(numberOfBananas2, p -> p >= 4, p -> p - 4).toList();
        System.out.println("List olarak kalan gunluk muz sayilari : "+list);
        System.out.println("Hayatta kalma gun sayisi = " + list.size());

    }
}

