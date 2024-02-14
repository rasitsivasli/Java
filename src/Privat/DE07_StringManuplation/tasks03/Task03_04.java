package Privat.DE07_StringManuplation.tasks03;

public class Task03_04 {
    public static void main(String[] args) {
        // verilen String de ki rakamlar haricindeki karekter sayısını yazdırınız

        String str = "dfgdfg324234#-#-+5454//*/**";
        String str2 = str.replaceAll("\\d","");
        System.out.println("str2 = " + str2);

        System.out.println(str2.length());

    }
}
