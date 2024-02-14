package CodeChallenges.Boz.Metod;

public class Task1_Void {
    public static void main(String[] args) {


        altString("Java guzeldir",3,7);
        altString("Benim adim Kadir Ulen",5,3);
        altString("Java guzeldir tabiki",5,25);
        String str = "Havalar güzel gidiyor nazar degmesin";
        altString(str,10,15);
    }

    public static void altString(String metin, int basIndex, int bitIndex) {// Olsuturulan metod daki isim ile main Metod daki
        // String ismi ayni olmayabilir ama ayni ifadeyi yukaridan cagirir

        if (basIndex > bitIndex) {
            System.out.println("Baslangic indexi bitis indexinden büyük olamaz");

        }else if (basIndex>metin.length()|| bitIndex>metin.length()){
            System.out.println("Verilen Index sinirlarin disinda");
        }else {
            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(metin.charAt(i));
            }
            System.out.println();
        }


    }
}
