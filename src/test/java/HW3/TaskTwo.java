package HW3;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextInt();
        double sum = value;
        int monthTimes = scanner.nextInt();
        for (int i = 0; i != monthTimes; i++){
            sum = sum  + value * 0.17;
        }
   System.out.println(sum);
    }

}
