package HW3;

import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {
    System.out.println("Сколько будет 5 * 5?");
        Scanner scanner = new Scanner(System.in);
        int result;
        do{
        result = scanner.nextInt();
        System.out.println("Попробуй еще раз!");
    }
    while(result != 25);
    System.out.println("Верно!");
    }

}
