package geeksforgeeks.arrays;

class RotateArray {

    private static int[] process(int[] arr, int d) {

        for (int i = 0; i < d; i++) {
            arr = leftRotateArraybyOne(arr);
        }

        return arr;

    }

    private static int[] leftRotateArraybyOne(int[] arr) {
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;

        }
        return arr;

    }

    private static int[] process2(int[] arr, int d) {
        reverseArray(arr, 0, d-1); 
        reverseArray(arr, d, arr.length-1); 
        reverseArray(arr, 0, arr.length-1); 

        return arr;

    }

    private static  void reverseArray(int[] arr,int first,int last) {

        while (first < last) {

            arr[first] = arr[first] + arr[last];
            arr[last] = arr[first] - arr[last];
            arr[first] = arr[first] - arr[last];
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] arr = process2(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 1);
        for (int a : arr) {
            System.out.print(a);
        }
    }
}