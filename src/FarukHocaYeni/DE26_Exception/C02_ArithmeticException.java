package FarukHocaYeni.DE26_Exception;

public class C02_ArithmeticException {
    public static void main(String[] args)  {

        try {
            int i , sum;
            sum = 10;
            for (int j = -1; j <3 ; j++) {
                sum=(sum/j);
            }
        } catch (ArithmeticException e) {
          //  throw new RuntimeException(e);
            System.out.println("0");
        }

        System.out.println("sum");

    }
}
