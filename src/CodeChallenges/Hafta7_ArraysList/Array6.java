package CodeChallenges.Hafta7_ArraysList;

public class Array6 {
    public static void main(String[] args) { //    //1.adim str tanimladik

        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir METHOD
         * yaziniz(return type int)
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */
        Integer[][] arr = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};
        System.out.println("Cift sayilarin toplami = " + ciftToplam(arr));

    }
    private static int ciftToplam(Integer[][] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    toplam += arr[i][j];
                }
            }
        }
        return toplam;
    }

}

