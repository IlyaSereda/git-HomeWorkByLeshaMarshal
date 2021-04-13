package HM2;

import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if(a<b & a<c & a<d) {
            System.out.println("Наименьшее число = " + a);
        } else if (b<a & b<c & b<d) {
            System.out.println("Наименьшее число = " + b);
        } else if (c<a & c<b & c<d) {
            System.out.println("Наименьшее число = " + c);
        } else if (d<a & d<b & d<c) {
            System.out.println("Наименьшее число = " + d);
        }
    }

}
