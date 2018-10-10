package geeksforgeeks.arrays;

class ReverseArray {

    private static int[] process(int[] arr) {

        int first = 0;
        int last = arr.length - 1;

        while (first < last) {

            arr[first] = arr[first] + arr[last];
            arr[last] = arr[first] - arr[last];
            arr[first] = arr[first] - arr[last];
            first++;
            last--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5,6 };
        a = process(a);
        for (int i : a) {
            System.out.print(i);
        }

    }
}