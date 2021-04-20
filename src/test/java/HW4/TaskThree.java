package HW4;

import java.util.Random;
import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {
        Random random = new Random();
       Scanner scanner = new Scanner(System.in);
       int len = scanner.nextInt();

        int[][] num = new int [len][len]; // Объявляем массив с размерностью, которую вводим вручную
        for (int i = 0; i < num.length; i++){
            for (int j =0; j < num.length; j++){
                num[i][j] = random.nextInt(30); // Тутачки, через боль и слезы заполняем двумерный массив
                if (num[i][j] % 2 == 0){
                    num[i][j] = 0;        // Если четные, то заменяем на 0
                } else {
                    num[i][j] = 1;     // Иначе (то есть не четные ), заменяем на 1
                }
            }
        }
        for (int i = 0; i < num.length; i++){
            for (int j =0; j < num.length; j++){  // Выводим
                System.out.print(num[i][j] + " "); // Выводим в строку и добавляем пробел между символами
            }
            System.out.println(" "); // Добавляем пустую строку
        }

    }

}
