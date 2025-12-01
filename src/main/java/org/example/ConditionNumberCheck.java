package org.example;

import java.util.Scanner;

public class ConditionNumberCheck {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Masukkan nilai:");
        int a = number.nextInt();

        if(a > 10 || a < 1){
            System.out.println("Angka di luar jangkauan");
        } else if (a%2 == 0) {
            System.out.println("Genap");

        }else {
            System.out.println("Ganjil");
        }
    }
}
