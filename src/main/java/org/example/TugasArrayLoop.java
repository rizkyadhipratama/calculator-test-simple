package org.example;

import java.util.Objects;

public class TugasArrayLoop {
    public static void main(String[] args) {
        String[] warna = {"hitam", "biru", "putih", "merah", "kuning"};

        System.out.println("Print semua element");
        for (String i: warna){
            System.out.println("Warnanya adalah" + i);
        }

        System.out.println("Print Selain Putih");
        printExceptPutih(warna);

        System.out.println("Excluding Putih Using Continue");
        excludingPutih(warna);
    }

    public static void printExceptPutih(String[] warna){
        for (String i: warna){
            if (!Objects.equals(i, "putih")){
                System.out.println(i);
            }
        }
    }

    public static void excludingPutih(String[] warna){
        for (String i: warna){
            if (i.equals("putih")){
                continue;
            }else {
                System.out.println(i);
            }
        }
    }



}
