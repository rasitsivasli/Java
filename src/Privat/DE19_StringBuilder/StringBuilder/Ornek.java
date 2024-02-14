package Privat.DE19_StringBuilder.StringBuilder;

public class Ornek {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();// Tanim String str ;
        StringBuilder str2 = new StringBuilder("Hasan");// String str2="Hasan" ;

        System.out.println("str2.reverse() = " + str2.reverse());
        String str3 = new String("Kemal");
        System.out.println("str2.append(str3) = " + str2.append(" ").append(str3));
        System.out.println("str2.delete(0,str1.length()) = " + str2.delete(0, str2.length()));


        /// Hiz testi
        String string="";
        StringBuilder sBuilder=new StringBuilder();
        StringBuffer sBuffer=new StringBuffer();

        long t1 =System.currentTimeMillis();// o esnadaki zamani ölcüyor
        for (int i = 0; i < 5000; i++) {
            string+=i;
        }
        long t2 =System.currentTimeMillis();// o esnadaki zamani ölcüyor. Iki zaman arasindaki fark islemin süresini ölcüyor
        for (int i = 0; i < 5000; i++) {
            sBuilder.append(i);
        }
        long t3 =System.currentTimeMillis();

        System.out.println("Builder ve String arasindaki hiz farki : "+(t2/t1));// iki zaman arasindaki fark
        System.out.println("Builder ve String arasindaki hiz farki : "+(t3/t2));// iki zaman arasindaki fark
    }
}
