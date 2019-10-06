package sorting;

import java.util.Arrays;

public class BubbleSort {

  static void sort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      boolean swapped = false;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[i]) {
          // swap
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;

          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[] {3, 2, 0, 9, 4, 5, 7};
    sort(arr);
    Arrays.stream(arr).forEach(System.out::print);
  }
}
