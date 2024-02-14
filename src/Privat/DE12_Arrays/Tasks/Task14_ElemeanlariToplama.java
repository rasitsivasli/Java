package Privat.DE12_Arrays.Tasks;

public class Task14_ElemeanlariToplama {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        int n = str.length();
        digitSum(str, n);
    }

    private static void digitSum(String str, int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(str.charAt(i))) {
                int ch = Integer.parseInt("" + str.charAt(i));/*once stringi "" ile toplayarak stringe cevirdik
                                                                 sonra Integer ile int yaptik*/
                sum += ch;
            }
        }
        System.out.println("sum = " + sum);
    }


}


