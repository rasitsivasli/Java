package Privat.DE24_Encapsulation.Tasks.task02;

public class Runner {
     /*
        B_RunnerMusteri ve Student classları create ediniz
        Student classı içinde;
        String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz

        B_RunnerMusteri classın içinde;
        girilen değerleri aşagıdaki gibi print eden code create ediniz
        Örnek:
        age 48'dir.
        name Haluk'tur.

        output
        "Student name is Haluk"
        "He is 48 years old"*/
     public static void main(String[] args) {

          //2.yol
          Student kisi2 = new Student();
          kisi2.setName("Ali");
          kisi2.setYas(35);
          System.out.println(kisi2);
          // 1. yol.. bu tercih edilir
          Student kisi = new Student("Haluk",48);
          System.out.println(kisi);

     }
}
