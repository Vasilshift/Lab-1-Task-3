// Даны действительные числа x, y. Вывести на экран то из них, которое меньше.

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter the 1-st value");
        int x = in.nextInt();

        System.out.println("Please, enter the 2-nd value");
        int y = in.nextInt();

        if (x >= y){
            System.out.println("Out minimum value: " + y);
        }
        else{
            System.out.println("Out minimum value is: " + x);

        }
    }
}
