package org.example;

public class CarsBrand {
    public static void carsBrand(){
        String[] cars = {"Mitsubishi", "Tesla", "Honda", "Nissan", "Kia", "Hyundai"};
        for (String car : cars) {
            System.out.println(car);
        }

    }

    public static void main(String[] args) {
        carsBrand();
    }
}
