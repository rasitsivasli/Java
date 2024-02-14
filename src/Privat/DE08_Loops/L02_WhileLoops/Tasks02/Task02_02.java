package Privat.DE08_Loops.L02_WhileLoops.Tasks02;

public class Task02_02 {
    /*
        1 den 50 ye kadar üçe bölünebilen sayıları ekrana yazdırın,

     */
    public static void main(String[] args) {


        int n = 1;
        String array = "";


        while (n <= 50) {

            if (n % 3 == 0) {
                array+=n+",";
            }
            n++;

        }
        System.out.println(array.substring(0,array.length()-1));
    }


}
