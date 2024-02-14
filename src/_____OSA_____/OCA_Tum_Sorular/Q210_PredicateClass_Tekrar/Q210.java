package _____OSA_____.OCA_Tum_Sorular.Q210_PredicateClass_Tekrar;

import java.util.function.Predicate;

public class Q210 {
    public static void main(String[] args) {
        Predicate<Integer> p = (n) -> n % 2 == 0;
        //insert code here


        Boolean s=p.test(100);// A sikki buydu
        System.out.println(s);
    }
}

/* which code snippet at line 9 prints true?
A.

B.  Boolean s=p.test(100);
    System.out.println(s);
C.
    Boolean s=p.test(100);
    if(s==1){
        System.out.println("false");
    }else{
          System.out.println("true");
     }
D.
    System.out.println(p.apply(100));

   Answer B
*/
