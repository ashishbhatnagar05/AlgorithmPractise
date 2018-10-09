package geeksforgeeks.arrays;

public class MissingNumber {
    //XOR(better)
    private static int process1(int[] a) {

        int x1 = a[0];
        for (int i = 1; i < a.length; i++) {
            x1 = x1 ^ a[i];
        }

        int x2 = 0;
        for (int i = 1; i <= a.length + 1; i++) {
            x2 = x2 ^ i;
        }

        return x1 ^ x2;
    }

    //Simple
    private static int process2(int[] a) {

        int n = a.length;
        int total = (n + 1) * (n + 2) / 2;

        for (int i = 0; i < a.length; i++) {
            total -= a[i];
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(process1(new int[]{1, 2, 3, 4, 6}));
        System.out.println(process2(new int[]{1, 2, 3, 4, 6}));
    }
}
