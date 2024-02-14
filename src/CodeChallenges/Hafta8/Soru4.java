package CodeChallenges.Hafta8;

import java.time.LocalDate;

public class Soru4 {
    public static <list> void main(String[] args) {

        //Bu günden itibaren ilk bir haftanın tarihlerini bir listede yazdırınız.

        LocalDate today= LocalDate.now();

        for (int i = 0; i < 7; i++) {
            System.out.print(today.plusDays(i).getDayOfWeek()+" ");
        }
    }

}
