package geeksforgeeks.arrays;

class MinimunMergeForPalindrome {

    private static int process(int[] arr) {

        int result = 0;

        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {

            if (arr[first] == arr[last]) {
                first++;
                last--;
            }

            else if (arr[first] > arr[last]) {
                last--;
                arr[last] = arr[last] + arr[last + 1];
                result++;
            } else if (arr[first] < arr[last]) {
                first++;
                arr[first] = arr[first] + arr[first - 1];
                result++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(process(new int[] { 11, 14, 15, 99 }));

    }

}