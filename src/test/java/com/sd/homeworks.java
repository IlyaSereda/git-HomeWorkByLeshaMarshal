package com.sd;

public class homeworks {
    public static void main(String[] args) {

        String name = "Ivan";
        String admin = name;
        String admin2 = "Armenin";
        int grade = 10;
        grade = grade + 5;
        float grade2 = grade / 2f;
        System.out.println(admin);
        System.out.println("Grade пользователя " + admin + " = " + grade);
        System.out.println("Grade пользователя " + admin2 + " = " + grade2);

    }
}
