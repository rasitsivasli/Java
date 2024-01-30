package _____OSA_____.DE40InterviewQuestions.Day05;

import java.util.*;


public class Q03_CollectionsMethodsTask {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır
    // 3 yer sağa döndür ve yazdır

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Sayi giriniz : ");
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextInt());
        }
        System.out.println("list = " + list);
        Collections.reverse(list);// burada tersten girisimize göre tersten siraliyor

        System.out.println("liste tersten siralandi = " + list);
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        System.out.println("set ile rastgele siralandi = " +set);// burada rastgele siraliyor

        System.out.println("Stream ile max bulundu = " + list.stream().mapToInt(p -> p).max());// once Int e cevirmek icin mapToInt kullanildistream ile bulduk
        System.out.println("Stream ile min bulundu = " + list.stream().mapToInt(p -> p).min());
        System.out.println("Stream sorted metolu ile "+list.stream().sorted().toList());


        System.out.println("Buyuk kucuk degismeden önceki hali = " + list);
        int maxCollection = Collections.max(list);
        System.out.println("maxCollection = " + maxCollection);
        int minCollection = Collections.min(list);
        System.out.println("minCollection = " + minCollection);
        Collections.replaceAll(list,maxCollection,minCollection);// büyük ve kücük sayinin yerleri degisiyor
        System.out.println("Buyuk kucuk degistikten sonraki hali = = " + list);


    }

}
