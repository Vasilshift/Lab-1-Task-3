// Сложить все натуральные числа от 1 до n

public class foo {

    public static void main(String args[]) {
        int sum = 0;
        int n = 5;

        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        System.out.print("sum =: " + sum);

    }
}
