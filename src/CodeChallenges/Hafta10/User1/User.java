package CodeChallenges.Hafta10.User1;

public class User {
    String ad;
    private int id = 005;
    int age;

    public User(String ad, int id, int age) {// full parametreli yada teleskobik diye adlandirilabilir
        this.ad = ad;
        setirId(id);
        this.age = age;
    }

    public User() {// fakir
    }

    // Kisinin yasi 18 den kucuk 120 den buyuk olamaz

    @Override
    public String toString() {
        return "User{" +
                "ad='" + ad + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public int getir() {
        return id;
    }

    public void setirId(int id) {
        if (id < 0) {
            this.id = 0;
        } else if (id > 10) {
            this.id = 10;
        } else this.id = 7;
    }
}
