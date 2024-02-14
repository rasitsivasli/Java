package CodeChallenges.Hafta6_Arrays;

import java.util.Arrays;

public class Soru20_IkiStringDiziyiBaskaBirDizideBirlestirme {
    public static void main(String[] args) {

//     İki array'i birleştirme
//
//        String[] name={"Ebru","Nuray","Beyza","Asya"};
//        String[]lastName={"al","gala","kal"};
//        output:
//[Ebru AL, Nuray GALA, Beyza KAL, Asya NULL]
        String[] name = {"Ebru", "Nuray", "Beyza", "Asya"};
        String[] lastName = {"al", "gala", "kal"};

        lastName = Arrays.copyOf(lastName, 4);

        for (int i = 0; i < name.length; i++) {
            if (lastName[i]==null){
                lastName[i]= "Null";
            }
            name[i] = name[i] + " " + lastName[i].toUpperCase() + " ";

        }
        System.out.println("newArr = " + Arrays.toString(name));

    }
}

