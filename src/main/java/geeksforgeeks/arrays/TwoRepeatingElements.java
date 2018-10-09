package geeksforgeeks.arrays;

public class TwoRepeatingElements {

    private static void process(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[Math.abs(a[i])] > 0) {
                a[Math.abs(a[i])] = -a[Math.abs(a[i])];
            } else {
                System.out.println(Math.abs(a[i]));
                System.out.println("aman");
            }
        }
    }

    public static void main(String[] args) {
        process(new int[]{1, 2, 1, 2, 1, 4, 2});
    }
}
