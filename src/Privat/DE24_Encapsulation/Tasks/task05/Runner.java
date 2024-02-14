package Privat.DE24_Encapsulation.Tasks.task05;

public class Runner {
     /*Task->
    Buch class'ında valuelari girilen bookName ve authorName (String ) İ
    ki tane attributes oluşturunuz.
    Buch class'ını datahiding yapınız. (Encapsulate)->pojo
    ClassMain class'ın içine object  create edip print eden code create ediniz.

 "Buch name is BOOKNAME and Author is AUTHORNAME"*/
     public static void main(String[] args) {
         Book book1 = new Book("Karamzov Kardesler","Dostojewski",false);
         Book book2 = new Book("Insan ne ile yasar","Tolstoy",true);

         System.out.println("book1 = " + book1);
         System.out.println("book2 = " + book2);

         System.out.println("book1.getBookName() = " + book1.getBookName());
         System.out.println("book1.getAuthorName() = " + book1.getAuthorName());

         System.out.println("book2.getBookName() = " + book2.getBookName());
         System.out.println("book2.getAuthorName() = " + book2.getAuthorName());

         System.out.println("book1.isOkunduMu() = " + book1.isOkunduMu());
         System.out.println("book2.isOkunduMu() = " + book2.isOkunduMu());
     }
}
