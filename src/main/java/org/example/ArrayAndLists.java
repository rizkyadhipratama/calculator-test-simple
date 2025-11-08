package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayAndLists {
    public static void main(String[] args) {
        ListBilangan();
        ListString();


    }
    public static void ListBilangan(){
        List<Integer> listBilangan = new ArrayList<>();

        listBilangan.add(1);
        listBilangan.add(3);
        listBilangan.add(5);

        System.out.println(listBilangan.get(2));
        System.out.println("Array Bilangan Integer");
        System.out.println(listBilangan);
    }

    public static void ListString(){
        List<String> listJapanCars = new ArrayList<>();

        listJapanCars.add("Honda");
        listJapanCars.add("Suzuki");
        listJapanCars.add("Toyota");

        listJapanCars.forEach((japanCar)->{
            System.out.println("Isi dari list:" + japanCar);
            System.out.println("####");
        });
    }
}
