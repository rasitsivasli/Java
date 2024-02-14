package DE16_LocaleDateTime;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class C13_OCA {
    public static void main(String[] args) {
 /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        Period p = Period.ofDays(1).ofYears(2);//ahan da Trick-> çoklu period parametrede daima sonuncu period kullanılır diğerleri ezilir

        d = d.minus(p);

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        System.out.println(d.format(f));

 /*
            Baba. 5/9/13 11:22
            Cocuk. 5/10/13 11:22-> 10.05.2013 11:22
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. Baba runtime exception is thrown.
*/
    }
}
