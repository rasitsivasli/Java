package _____OSA_____.OCA_Tum_Sorular.Q073_LocalDateAtama_Tekrar;

import java.time.LocalDate;

public class Q073 {
	public static void main(String[] args) {
        LocalDate date= LocalDate.of(2012, 1, 30);
        date.plusDays(10);
        System.out.println(date);
    }

}
/**
 * What is the result?
A. 2012-02-10 00:00
B. 2012-01-30
C. 2012-02-10
D. A DateTimeException is thrown at runtime.















Answer: B
*/
