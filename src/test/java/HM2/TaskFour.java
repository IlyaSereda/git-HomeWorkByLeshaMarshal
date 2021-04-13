package HM2;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberMonth = scanner.nextInt();
        String nameMonth;


        switch (numberMonth){
            case 1: nameMonth = "Январь";
                break;
            case 2: nameMonth = "Февраль";
                break;
            case 3: nameMonth = "Март";
                break;
            case 4: nameMonth = "Апрель";
                break;
            case 5: nameMonth = "Май";
                break;
            case 6: nameMonth = "Июнь";
                break;
            case 7: nameMonth = "Июль";
                break;
            case 8: nameMonth = "Август";
                break;
            case 9: nameMonth = "Сентябрь";
                break;
            case 10: nameMonth = "Октябрь";
                break;
            case 11: nameMonth = "Ноябрь";
                break;
            case 12: nameMonth = "Декабрь";
                break;
            default: nameMonth = "Такого месяца в нашей Вселенной не существует :)";

        }

        System.out.println(nameMonth);

    }
}
