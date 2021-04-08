package com.sd;

public class RaschetTovarov {
    public static void main(String[] args) {
        // git teat
        //A
        double A = 200; //15%  10A 2B
        double B = 30;
        double sum;
        double diskount = 0.15;
        sum = A * 10 - (A * 10) * diskount + B * 2;
        System.out.println(sum);

        //B
        A = 500; //50%  7A 1B
        B = 50;
        double bsum;
        diskount = 0.5;
        bsum = A * 7 - (A * 7) * diskount + B;
        System.out.println(bsum);

        //C
        A = 300; //15%  2A 3B
        B = 20;
        double csum;
        diskount = 0.1;
        csum = A * 2 - (A * 2) * diskount + B * 3;
        System.out.println(csum);


    }
}
