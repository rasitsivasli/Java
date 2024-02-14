package Privat.DE12_Arrays.Tasks;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.

        // 1.yol da rakamlari topluyoruz

        String str = "$12 $23 $10 $2 $5 $2";
        String yeniStr = str.replace("$", "").replace(" ", "");


        yeniStr = yeniStr + " ";
        System.out.println("yeniStr = " + yeniStr);
        int toplam = 0;
        int ch;
        for (int i = 0; i < yeniStr.length() - 1; i++) {
            ch = Integer.parseInt(yeniStr.substring(i, i + 1));
            toplam += ch;    // burada rakamlarin toplamini buldum, sayilarin toplami degil
        }
        System.out.println("toplam = " + toplam);



        System.out.println("2.yol...........");

        String[] arr = str.replace("$","").split(" ");// Dollars sind weg.
        int length = arr.length;

        int toplam2 = 0;
        for (int i = 0; i <length; i++) {

            toplam2 += Integer.parseInt(arr[i]);// Strings werden Integer.

        }
        System.out.println("toplam2 = " + toplam2);

    }
}