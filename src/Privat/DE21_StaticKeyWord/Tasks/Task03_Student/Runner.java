package Privat.DE21_StaticKeyWord.Tasks.Task03_Student;

import java.util.ArrayList;

public class Runner {
    /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    B_RunnerMusteri Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */

    public static void main(String[] args) {
        Lesson mat101 = new Lesson("Matematik", 3);
        Lesson java101 = new Lesson("Java", 5);
        Lesson fizik101 = new Lesson("Fizik", 4);
        Lesson turkce101 = new Lesson("Türkce", 4);

        ArrayList<Lesson> dersler = new ArrayList<>();
        dersler.add(mat101);
        dersler.add(java101);
        dersler.add(fizik101);
        dersler.add(turkce101);
        Student ogr1 = new Student("Hasan",15);
        for (int i = 0; i < dersler.size(); i++) {
            int mevcutKredi = ogr1.toplamCredi();
            if (mevcutKredi+dersler.get(i).credit<= ogr1.maxKredit){
                // egere bu durum gerceklesirse ögrenci dersi alabilir
                ogr1.dersList.add(dersler.get(i));
            }
        }
        System.out.println(ogr1);

    }
}
