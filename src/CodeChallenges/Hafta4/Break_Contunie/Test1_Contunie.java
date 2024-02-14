package CodeChallenges.Hafta4.Break_Contunie;

import java.util.Scanner;

public class Test1_Contunie {
    public static void main(String[] args) {
        // Bir harf giriniz, eger q girerseniz program sonlanir..


        int i = 0;
        while (i < 10) {

            if (i == 5 || i==7) {
                i++;
                continue;
            }
            System.out.print(i + ",");
            i++;
        }

    }
}
