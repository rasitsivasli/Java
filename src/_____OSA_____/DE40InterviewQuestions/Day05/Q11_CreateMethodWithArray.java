package _____OSA_____.DE40InterviewQuestions.Day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q11_CreateMethodWithArray {
    /*
            ||This Part Should be in Main Method||

             -Create an array of size 5, assign some random values from 0 to 10
             -(use random class and for loop to assign values)


            ||You should create public static void methods fori loop
            (Parameter should be int Array for methods)||

             -1-Create a method that prints array like "2 3 1 10 2",
             space between elements of array
             -2-Create a method that prints the sum of an array
             -3-Create a method that prints the max element of an array

            P.S: Return type should be void because we are not returning anything just printing
    */
    public static void main(String[] args) {
        Integer [] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10+1);
        }
        metot(arr);
    }

    private static void metot(Integer[] arr) {
        List<Integer> list = new ArrayList<>(List.of(arr));
        System.out.println("eski list : "+list);

        Collections.shuffle(list);// shuffle rastgele olusturan metot
        System.out.println("Rastgele yeni list : "+list);

        System.out.println("Toplam : "+list.stream().mapToInt(p -> p).sum());
        System.out.println("Max : "+list.stream().mapToInt(p -> p).max());
        System.out.println("Min : "+list.stream().mapToInt(p -> p).min());

    }}
