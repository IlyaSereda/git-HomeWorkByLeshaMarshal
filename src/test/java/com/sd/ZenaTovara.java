package com.sd;

public class ZenaTovara {

    public static void main(String[] args) {

        double A = 1000;
        double B = 500;
        double summa;
        double disk = 0.1;
        double diskount;
        diskount = (A + B) * disk;
        summa = A + B - (A + B) * disk;

        System.out.println(diskount);
        System.out.println(summa);


    }

}
