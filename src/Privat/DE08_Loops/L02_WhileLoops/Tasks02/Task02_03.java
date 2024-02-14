package Privat.DE08_Loops.L02_WhileLoops.Tasks02;

public class Task02_03 {
    public static void main(String[] args) {
        // 1 den 50 ye kadar üçe bölünebilen sayıları büyükten küçüğe doğru ekrana yazdırın
        int n = 50;
        String array = "";


        while (n>=1) {

            if (n % 3 == 0) {
                array+=n+",";
            }
            n--;

        }
        System.out.println(array.substring(0,array.length()-1));
    }
}
