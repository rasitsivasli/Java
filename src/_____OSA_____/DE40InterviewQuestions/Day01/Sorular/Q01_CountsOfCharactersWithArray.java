package _____OSA_____.DE40InterviewQuestions.Day01.Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini(kaç adet olduğunu) ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            System.out.print("Bir string giriniz: ");
            String str = scan.nextLine();

            List<String> list = new ArrayList<>(List.of(str.split("")));

            while (!list.isEmpty()) {
                String ch = list.get(0);// her seferinde ilk eleman silinecegi icin yeniden bastan itibaren kontrol ediyoruz
                int count = 0;

                for (int i = 0; i < list.size(); i++) {
                    if (ch.equals(list.get(i))) {
                        count++;
                        list.remove(i);
                        i--; // Bir önceki elemanı kontrol etmek için indeksi azalttim
                    }
                }
                System.out.println(ch + " elemani " + count + " kez vardir");
            }

        }

}
