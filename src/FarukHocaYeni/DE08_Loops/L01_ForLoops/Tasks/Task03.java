package DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktoryeli hesaplanacak Sayıyı yazınız : ");
        int n = scanner.nextInt();
        int faktoryel=1;
        for (int i = 1; i <=n ; i++) {
            faktoryel *= i;  // faktoryel = faktoryel*i;
        }
        System.out.println(n+"! = "+faktoryel);

    }
}
