package Privat.DE16_LocaleDateTime.Tasks;

import java.time.Year;

public class T07 {
    // 1900 yılından itibaren artık yılları yazdırınız
    public static void main(String[] args) {

        for (int i = 1900; i <= 2023; i++) {
            if (Year.isLeap(i)) System.out.print(i + ",");
        }
    }
}
