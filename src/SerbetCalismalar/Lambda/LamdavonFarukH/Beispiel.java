package SerbetCalismalar.Lambda.LamdavonFarukH;

import java.util.Arrays;
import java.util.List;

public interface Beispiel {
   int metot1(int a);
   public class Lambda{
       public static void main(String[] args) {

           Beispiel obj1 = (a)-> a*a;
           System.out.println("obj1.metot1(25) = " + obj1.metot1(25));
           List<Integer> list = Arrays.asList(1,2,3,4,5,6);
           list.forEach(System.out::print);
           list.forEach((Integer e)->{
               int a = e*2;
               System.out.print(a+" ");
           });
       }
   }
}
