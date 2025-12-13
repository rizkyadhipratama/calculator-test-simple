package org.example;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        boolean result = anagram("Halo", "Olah");
        System.out.println(result);
    }

    public static boolean anagram(String A, String B){
        boolean result = false;

        if(A.length() == B.length()){
            char[] A1 = A.toLowerCase().toCharArray();
            char[] B1 = B.toLowerCase().toCharArray();
            Arrays.sort(A1);
            Arrays.sort(B1);
            result = Arrays.equals(A1, B1);
        }else {
            result = false;
        }

        return result;
    }
}
