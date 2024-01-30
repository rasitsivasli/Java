package _____OSA_____.DE40InterviewQuestions.Day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q005_DifferenceBetweenArrayLargestAndSmallest {
    /*  Create a function that takes an array and the difference between the largest
and the smallest numbers.
Ask user to enter array elements.
   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("array uzunluk :");
        int uzunluk = scanner.nextInt();
        for (int i = 0; i < uzunluk; i++) {
            System.out.print("Sayi giriniz : ");
            list.add(scanner.nextInt());
        }
        System.out.println("list = " + list);
        int enBuyuk = list.get(0);
        int enKucuk = list.get(0);

        for (Integer integer : list) {
            if (enBuyuk < integer) enBuyuk = integer;
        }
        for (Integer integer : list) {
            if (enKucuk > integer) enKucuk = integer;
        }
        System.out.println("enBuyuk-enBuyuk = " + (enBuyuk - enKucuk));

        // 2. yol
        System.out.println(list.stream().reduce(Math::max));
        System.out.println(list.stream().min(Integer::compareTo));
        System.out.println(list.stream().max(Integer::compareTo));
    }

}
