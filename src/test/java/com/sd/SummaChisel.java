package com.sd;

public class SummaChisel {
    public static void main(String[] args) {

        int z = 2147483647;
        z = z + (- z * 2 - 1);
        System.out.println(z);

    }

}
