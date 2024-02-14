package Privat.DE24_Encapsulation;

public class  C01_Encapsulation {
 /*
		 	1) Encapsulation kisaca "data hiding" demektir

		 	2) Basarili bir Encapsulation için :
		 		a)Nasil kullanilacagi ve hedefi net olmalidir.(Direksiyon gibi)
		 		b)Kodun karmasikligi kullanimin karmasikligina sebep olmamalidir.Yani cok
		     	karmasik kodlardan olusan bir yapi basit bir sekilde kullanilabilmelidir.
		 		c)Bir bolumun hata vermesi diger bolumlerin hatasına sebep olmamalidir.

		 	3) Encapsulation yapısı  tanımlanması için
		 		a)Access modifier'lari private tanımlanmalı
		 		b) istenilen field'lar için  getter ve setter methodlari ile "encapsulated" datalar okunmalı (getter) ve
		 	    update edilebilmeli(setter)	.
		 	    c) uygun constructor tanımlanmalı.
		 	    d) toString() method tanımlanmalı


		 	4) Encapsulation'in faydalari
		 		a) Esneklik(Flexibility). Field'lar setter() methodunu ile istenildiği kadar update edilebilir
		 		b) Reusability-> Field'lar  getter ve setter method'lari bir kere tanımlanıp A_proje icindeki
		 	     tum classlar'dan istenildiği kadar kullanabiliri.
		 		c) Istenilen field  okunabilir(getter() olustur), istenilen field okunamaz(getter() olusturma)
		 	    hale getirebilir.
		 		d) Istenilen field degistirebilir (setter() olustur), Istenilen field degistirilemez
		 	    (setter() olusturma) yapabilir.

		 	    ahan da  TRICK : Tum variable'lar private ve sadece getter() method tanımlanan  class'da
		 	     data'lar sadece okunabilir, degistirilemez. Bu tarz class'lara "immutable class" denir.

		 	5) Kullanicinin kullandigi sistem arkasindaki karmasik yapiyi kullaniciya gosterilmez.

		 */
 public static void main(String[] args) {
     Canli can = new Canli();
    // can.tur = "INSAN";   // doğrudan veri atama
     can.setTur("INSAN"); // kapsülleyerek veri atama
     String tur="";
   //tur = can.tur; // doğrudan veri alma
   //  System.out.println(tur);

     tur = can.getTur(); // kapsülleyerek veri alma
  //   System.out.println(tur);

     can.setTur("Imnsan");
     System.out.println(can.getTur());
     Canli2 can2 = new Canli2("Havan",2101);
     // ustteki işlemde can2 adında bir objeyi Canli2 classından  oluşturduk,
     // sonra can2.tur="Hayvan", sonra can2.dYili=2101; veya can2.setTur("Hayvan")+can2.setdYili(2101)
     System.out.println(can2.getTur());

     int a = 5 ;
     int b = a ; // bu şu demek. get a  sonra  b ye set et
 }
}
