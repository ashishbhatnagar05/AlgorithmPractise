package geeksforgeeks.arrays;

public class OddOcurringElement {

    private static int process(int[] a) {
        int x1 = 0;
        for (int i = 0; i < a.length; i++)
            x1 ^= a[i];
        return x1;
    }

    public static void main(String[] args) {
        System.out.println(process(new int[]{1, 2, 1, 1, 4, 4, 2}));
    }
}
