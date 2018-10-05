package recusion;

public class Factorial {
    public static void main(String[] args) {
        int num = 4;
        printFactorialDescending(num, 1);
        System.out.println();
        System.out.println(fact(num));
    }

    private static void printFactorialDescending(int n, int sum) {
        if (n != 0) {
            sum = n * sum;
            System.out.print(sum + " ");
            printFactorialDescending(n - 1, sum);
        }
    }

    private static int fact(int n) {
        if (n != 0)
            return n * fact(n - 1);
        return 1;

    }
}
