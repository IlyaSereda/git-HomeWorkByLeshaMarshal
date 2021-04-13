package HM2;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class TaskOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double d;
        double r = scanner.nextInt();

        d = (a*a)+(b*b);
        d = sqrt(d)/2d; // вычисляем допустимый радидус окружности

        if (d <= r) {
            System.out.println("Данной отверстие можно закрыть");
        }
        else
        {
            System.out.println("Отверстие больше радиуса картона!");
            System.out.println("Требуется картон радиусом " + d);
        }


    }


}
