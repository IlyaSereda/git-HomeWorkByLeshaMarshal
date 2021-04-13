package HM2;

import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result;

        if (a % 2 == 0) {
            result = a * b;
        } else {
            result = a + b;
        }
        System.out.println(result);
    }

}
