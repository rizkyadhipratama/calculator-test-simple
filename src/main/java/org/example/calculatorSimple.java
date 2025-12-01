package org.example;

public class calculatorSimple {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int times(int a, int b){
        return a*b;
    }
    public static long divide(long a, long b){
        return a/b;
    }
    public static float remainder(float a, float b){
        return a%b;
    }

    public static void main(String[] args) {
        int sum = sum(5,2);
        int minus = minus(5,2);
        int times = times(55, 250);
        long divide = divide(55, 11);
        float reminder = remainder(10, 2);
        System.out.println("Penjumlahan = "+sum);
        System.out.println("Minus ="+minus);
        System.out.println("Times ="+times);
        System.out.println("Division ="+divide);
        System.out.println("Remainder ="+reminder);

    }
}
