package geeksforgeeks.arrays;

import java.util.Arrays;

class MinimumDifferencePair {

    private static int process1(int[] arr) {

        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) < diff) {
                    diff = Math.abs(arr[i] - arr[j]);
                }
            }
        }

        return diff;

    }

    private static int process2(int[] arr) {

        int diff = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) < diff) {
                diff = Math.abs(arr[i] - arr[i - 1]);
            }
        }

        return diff;

    }

    public static void main(String[] args) {
        System.out.println(process1(new int[] { 1, 5, 3, 19, 18, 25 }));
        System.out.println(process2(new int[] { 1, 5, 3, 19, 18, 25 }));
    }
}