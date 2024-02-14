package Privat.DE08_Loops.L01_ForLoops.Tasks;

public class Task22 {

    public static void main(String[] args) {

        /* Task-> 100'den 0'a kadar bütün tek sayıları print eden code create ediniz.
        99-98-97-96....
        */

for(int i=99; i>=0 ; i-=2){
    System.out.print(i+",");
}
////2,Yol
        System.out.println("");
        for (int i = 100; i>0; i--) {
            if (i%2==1){
                System.out.print(i+",");
            }
        }


    }
}
