package CodeChallenges.Hafta7_ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) { //    //1.adim str tanimladik

        //Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.




        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz : " );
        String str = scanner.nextLine();

        List<String> list= new ArrayList<>();
        list.addAll(List.of(str.split(" ")));
        System.out.println("list = " + list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+1+".kelimenin uzunlugu : " + list.get(i).length());
        }
    }

    }



