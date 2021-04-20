package HW4;

import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int product = 1;
        int max = 0;
        int maxId = 0;
        int min = 0;
        int minId = 0;

        int[] num = new int [n]; // Тутачки, вводим вручную длину массива
        for (int i = 0; i < num.length; i++){
            num[i] = (int)(Math.random()*20) - 10; // Тутачки заполняем массив рандомно (в том числе и отрицательными числами)
            if(num[i] < 0){
                sum += num[i];
            }
            if(max < num[i]){
                max = num[i];
                maxId = i;
            }
            if(min > num[i]){
                min = num[i];
                minId = i;
            }

        }

        for (int i = minId; i < maxId; i++){ //умножение работает некорретно!
            product *=  num[i];
        }
        for (int i : num){
            System.out.print(i + " "); // Выводим
        }
        System.out.println(" ");
        System.out.println(sum);
        System.out.println(" ");
        System.out.println(product);
    }
}
