package Privat.DE19_StringBuilder.Tasks.AsyaHanim;

public class StringVeStringBuilderFarki {
    public static void main(String[] args) {
        String str="Hollanda";
        StringBuilder sb=new StringBuilder("Hollanda");

        deleteFrom(sb);//Hola
        deleteFrom(str);//Holla

        System.out.println("sb = " + sb);//Hola
        System.out.println("str = " + str);//Hollanda hiç bir şekilde etkilenmez...

    }
    private static void deleteFrom(StringBuilder sb) {
        System.out.println("sb in the method: "+sb.delete(3,sb.lastIndexOf("a")));
    }
    private static String deleteFrom(String sb) {

        System.out.println("str in the method: "+sb.substring(0,5));
        sb=sb.substring(0,5);
        return sb;
    }

}
