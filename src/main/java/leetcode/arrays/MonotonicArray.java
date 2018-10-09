package leetcode.arrays;

public class MonotonicArray {

    private static boolean process(int[] a) {
        boolean flag = false;
        int x = 0;
        int y = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] - a[i - 1] >= 0) {
                x++;

            }
            if (a[i] - a[i - 1] <= 0) {
                y++;

            }
        }

        if (a.length - x == 1 || a.length - y == 1) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(process(new int[]{6,5,4,4}));
    }


}
