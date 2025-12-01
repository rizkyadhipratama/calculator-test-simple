package org.example;

import java.io.IOException;
import java.util.Scanner;

public class ComparisonOperator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = sc.nextInt();

        System.out.print("Input second number: ");
        int b = sc.nextInt();

        System.out.println("a="+a +" b="+ b);
        System.out.println("Is a and b equals?" + (a==b));
        System.out.println("Is a and b inequals?"+ (a!=b));
        System.out.println("Is a greater than b?" + (a>b));
        System.out.println("Is a greater than equals b?"+ (a>=b));
        System.out.println("Is a less than b?"+ (a<b));
        System.out.println("Is a less than equals b?"+ (a<=b));

    }
}
