package org.example;

public class OperatorPenugasan {
    public static long timesOperator(long a){
        a *= a;
        return a;
    }

    public static int sumOperator(int a){
        a += a;
        return a;
    }

    public static int minusOperator(int a){
        a -=a;
        return a;
    }

    public static long divideOperator(long a){
        a /= a;
        return a;
    }

    public static long remainderOperator(long a){
        a %= a;
        return a;
    }

    public static void main(String[] args) {
        int a;
        long b;
        int c;
        long d;
        long e;
        a = sumOperator(123);
        b = timesOperator(10);
        c = minusOperator(152);
        d = divideOperator(5);
        e = remainderOperator(53);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
