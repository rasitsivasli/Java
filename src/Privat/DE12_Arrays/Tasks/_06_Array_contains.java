package Privat.DE12_Arrays.Tasks;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..
        String[] arr = {"Apple", "Orange", "Banana", "Pineapple"};

        System.out.println("appleVarMi(arr) = " + appleVarMi(arr));

    }

    private static boolean appleVarMi(String[] arr) {
        boolean appleVarmi=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("Apple")) {
                appleVarmi = true;
                break;
            }
        }
        return appleVarmi;
    }
}
