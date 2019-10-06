package sorting;

import java.util.Arrays;

public class InsertionSort {
  static void sort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (arr[j] < arr[j - 1]) {
          // swap
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        } else {
          break;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[] {3, 2, 0, 9, 4, 5, 7};
    sort(arr);
    Arrays.stream(arr).forEach(System.out::print);
  }
}
