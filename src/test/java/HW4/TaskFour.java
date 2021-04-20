package HW4;

import java.util.Random;
import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while ( n<=3){
            System.out.println("Вы ввели неподходящее число!"); //тутачки вводим длину массива с клавы
            n = scanner.nextInt();
        }

        int[] num = new int [n];
        for (int i = 0; i < num.length -1; i++){
            num[i] = random.nextInt(30); // Тутачки заполняем массив рандомно
        }

        System.out.println(" "); // Пустая строка, чтоб отделять введенное число от результата в консоли

        for (int i : num){
            System.out.println(i);
        }

        System.out.println(" "); // Пустая строка, чтоб разделить два массива

        for (int j = 0; j < num.length-1; j++){ // Тутачки я не знаю, j должно быть равно 0 или 1?
            if (num[j] % 2 == 0){               // пусть будет =0
                System.out.println(num[j]);
            }
        }

    }

}