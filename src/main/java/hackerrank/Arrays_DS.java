package hackerrank;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/arrays-ds/problem
public class Arrays_DS {

  public static void main(String[] args) {
    int[] arr = new int[4];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;

    Arrays.stream(arr).forEach(System.out::print);
    arr = reverseArray(arr);
    Arrays.stream(arr).forEach(System.out::print);
  }

  static int[] reverseArray(int[] a) {
    int n = a.length;
    for (int i = 0; i < n / 2; i++) {
      int temp = a[n - 1 - i];
      a[n - 1 - i] = a[i];
      a[i] = temp;
    }
    return a;
  }
}
