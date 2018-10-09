package geeksforgeeks.arrays;

import java.util.Arrays;

public class MissingElementsIn0_99 {

    private static boolean seen[];
    private static final int LIMIT = 100;

    static {
        seen = new boolean[LIMIT];
        for (boolean i : seen) {
            i = false;
        }
    }

    private static void process(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] < LIMIT) {
                seen[a[i]] = true;
            }
        }

        int i = 0;
        while (i < LIMIT) {
            if (seen[i] == false) {
                int j = i + 1;
                while (j < LIMIT && seen[j] == false) {
                    j++;
                }
                if (j - i == 1) {
                    System.out.println(i);
                } else {
                    System.out.println(i + "-" + (j - 1));
                }
                i = j;
            } else {
                i++;
            }

        }

    }

    public static void main(String[] args) {
        process(new int[]{88, 105, 3, 2, 200, 0, 10});
    }
}
