package geeksforgeeks.arrays;

class SegregateBinaryArray {

    private static int[] process(int[] a) {

        int countOfOne = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                countOfOne = i++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (i < countOfOne - 1) {
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }

        return a;
    }

    private static int[] process2(int[] a) {

        int first = 0;
        int last = a.length - 1;

        while (first < last) {
            if (a[first] == 1) {
                // swap
                a[last] = a[last] + a[first];
                a[first] = a[last] - a[first];
                a[last] = a[last] - a[first];
                last--;
            } else {
                first++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        print(process(new int[] { 1, 0, 0, 1, 0, 1, 0 }));
        print(process2(new int[] { 1, 0, 0, 1, 0, 1, 0 }));

    }

    private static void print(int[] a) {
        for (int a1 : a) {
            System.out.print(a1);
            ;
        }
    }
}