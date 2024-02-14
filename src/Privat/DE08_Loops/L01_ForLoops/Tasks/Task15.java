package Privat.DE08_Loops.L01_ForLoops.Tasks;

public class Task15 {
	public static void main(String[] args) {
		/*

		Task-> verilen bir String'deki rakam sayısını print eden code create ediniz
		length() metotun kullanmadan yapın
		Örnek
		String str = "jadsjl52kjşlk524524j5j24";
		output : 11
		 */


		String str = "Ben 1 garip keloglanim345";

		int sayac=0;

		for ( int i = 0; i<str.length() ; i++){
			char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
				sayac ++;
            }

        }
		System.out.println("rakam sayisi = " + sayac);
	}
}
