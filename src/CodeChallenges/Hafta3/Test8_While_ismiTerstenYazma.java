package CodeChallenges.Hafta3;

public class Test8_While_ismiTerstenYazma {
    public static void main(String[] args) {

     String name = "rasit" ;
     int n = name.length();

     while (n>0){
         String lastLetter= ""+name.charAt(n-1);
         System.out.print(lastLetter);

         n--;

     }

    }
}
