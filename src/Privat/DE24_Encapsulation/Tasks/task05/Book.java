package Privat.DE24_Encapsulation.Tasks.task05;

public class Book {
    /*Task->
    Buch class'ında valuelari girilen bookName ve authorName (String ) İ
    ki tane attributes oluşturunuz.
    Buch class'ını datahiding yapınız. (Encapsulate)->pojo
    ClassMain class'ın içine object  create edip print eden code create ediniz.

 "Buch name is BOOKNAME and Author is AUTHORNAME"*/

    private String bookName;
    private String authorName;

    private boolean okunduMu;

    public Book(String bookName, String authorName, boolean okunduMu) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.okunduMu = okunduMu;
    }
    public String isOkunduMu() {
        if (okunduMu) return "BookManager okundu";
        else return "BookManager henuz okunmadi";
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return "{" +
                "Buch name is'" + bookName + '\'' +
                " and Author is '" + authorName + '\'' +" Durum : "+isOkunduMu()+
                '}';
    }
}
