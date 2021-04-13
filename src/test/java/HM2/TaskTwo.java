package HM2;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dayNumber  = scanner.nextInt();
        String dayName;

        switch (dayNumber){
            case 1: dayName = "Понедельник";
                break;
            case 2: dayName = "Вторник";
                break;
            case 3: dayName = "Среда";
                break;
            case 4: dayName = "Четверг";
                break;
            case 5: dayName = "Пятница";
                break;
            case 6: dayName = "Суббота";
                break;
            case 7: dayName = "Воскресенье";
                break;
            default: dayName = "Такого дня в нашей системе исчесления дней денели не существует :)";
        }
        System.out.println(dayName);
    }
}
