package Privat.DE18_ImmutableAndPassBy__;

public class DizilerdeReferansDegerleri {
    public static void main(String[] args) {
        String s1="Ali";
//        System.out.println(System.identityHashCode(s1));
//        String s2="Al";
//        s2=s2+"i";
//        System.out.println(System.identityHashCode(s2));
//        String s3=new String("Ali");
//        System.out.println(System.identityHashCode(s3));
//        System.out.println(s1==s2);//true aynı referansı gösterdiği için
//        System.out.println(s1==s3);//false
//        System.out.println(s1.equals(s3));//true
//        ArrayList<Integer> list1=new ArrayList<>();
//        System.out.println(System.identityHashCode(list1));
//        list1.add(4);
//        System.out.println(System.identityHashCode(list1));
//        list1.add(5);
//        list1.remove(0);
//        System.out.println(System.identityHashCode(list1));
//
//        String[] arr1=new String[2];
//        System.out.println(System.identityHashCode(arr1));//boş
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i]="hasan";//aktardık dizi güncellendi
//        }
//        System.out.println(System.identityHashCode(arr1));//boş
//        int a=0;
//        a++;
//        String str="hasan";
//
//        System.out.println(System.identityHashCode(str));//
//
//        System.out.println(System.identityHashCode( str.toUpperCase()));//
        int[] arr={1,2,3,4};
        int[] arr2={1,2,3,4};
        int a=3;
        int b=3;

        System.out.println(arr==arr2);//false

    }
}
