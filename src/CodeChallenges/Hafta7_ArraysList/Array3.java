package CodeChallenges.Hafta7_ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) { //    //1.adim str tanimladik

        /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde sıfır hariç
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac sayi girmek istiyorsunuz : ");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number : ");
            list.add(scanner.nextInt());
        }
        // List<Integer> newList = new ArrayList<>();1,2,3,4,5,6
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0 && list.get(i)!= 0) {
                count++;
            }else {
                list.remove(list.get(i));
                i--;// index azaldigi icin tekrar bir önceki sayiya bakmasi icin bir azalttim
            }
        }
        System.out.println("count = " + count);
        System.out.println("newList = " + list);
    }

}

