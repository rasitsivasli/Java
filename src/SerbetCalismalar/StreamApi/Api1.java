package SerbetCalismalar.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class Api1 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Ali"));
        users.add(new User(2,"Veli"));
        users.add(new User(3,"Necati"));
        users.add(new User(4,"Semsi"));
        users.add(new User(5,"Pasa"));
        users.add(new User(6,"Pasaji"));
        users.forEach(User::talk);
        List<User> filteredList = users.stream().filter(user -> user.id>5).toList();
        System.out.println("filteredList ");
        filteredList.forEach(User::talk);


    }
    public static class User{
        int id;
        String name ;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
        public void talk(){
            System.out.println("Hi, I am "+this.name);
        }
    }

}
