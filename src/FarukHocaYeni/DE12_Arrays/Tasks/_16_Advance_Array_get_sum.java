package DE12_Arrays.Tasks;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.

        String str = "$12 $23 $10 $2 $5 $2";
        str = str.replace("$","");
        String[] diziStr = str.split(" ");
        System.out.println(Arrays.toString(diziStr));
        int toplam=0;
        for (int i = 0; i < diziStr.length ; i++) {
            toplam += Integer.parseInt(diziStr[i]);
        }
        System.out.println("toplam = " + toplam);

    }
}