package HW4;

import java.util.Random;

public class TaskTwo {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int [10];
        for (int i = 0; i < num.length -1; i++){
            num[i] = random.nextInt(100); // Заполняем массив случайными числами
        }
        int temp;
        boolean sort = false;
        while (!sort){
            sort = true;
            for (int i = 0; i < num.length -1; i++){
                if (num[i] > num[i+1]){ // Вот тут ставим, чтоб по возрастанию
                    temp = num[i];
                    num[i] = num[i+1]; // Сортируем
                    num[i+1] = temp;
                    sort = false;
                }
            }
        }
        for (int i : num){
            System.out.println(i); // Выводим
        }
    }
}
