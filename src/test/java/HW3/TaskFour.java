package HW3;

public class TaskFour {
    int sum;

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=99;i++){
            if (i % 2 != 0){
                sum = sum + i;
                i++;
            }
        }
     System.out.println(sum);

    }

}
