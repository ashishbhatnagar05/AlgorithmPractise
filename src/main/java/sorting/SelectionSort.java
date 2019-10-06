package sorting;

import java.util.Arrays;

public class SelectionSort {
  static void sort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int min_idx = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[min_idx] > arr[j]) {
          min_idx = j;
        }
      }
      // swap
      int temp = arr[i];
      arr[i] = arr[min_idx];
      arr[min_idx] = temp;
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[] {3, 2, 0, 9, 4, 5, 7};
    sort(arr);
    Arrays.stream(arr).forEach(System.out::print);
  }
}
