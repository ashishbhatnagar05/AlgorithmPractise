package geeksforgeeks.arrays;

class MoveZerosToEnd {

    private static int[] process(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = process(new int[] { 1, 2, 0, 4, 3, 0, 5, 0 });
        for (int a : arr) {
            System.out.print(a);
        }
    }
}